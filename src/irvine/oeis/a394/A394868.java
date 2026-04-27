package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394868 a(n) is the final number of steps reached by Alice and Bob, in the optimization game on an n X n grid described in comments.
 * @author Sean A. Irvine
 */
public class A394868 extends Sequence1 {

  // After Yifan Xie

  private static final int[][] ALICE_OFFSETS = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
  private static final int[][] BOB_OFFSETS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

  private static class State {
    private final int mIdx;
    private final boolean mAlice;
    private final long mMask;

    State(final int idx, final boolean alice, final long mask) {
      mIdx = idx;
      mAlice = alice;
      mMask = mask;
    }

    @Override
    public int hashCode() {
      return ((mIdx * 31) + (mAlice ? 1 : 0)) * 31 + Long.hashCode(mMask);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State s = (State) obj;
      return mIdx == s.mIdx && mAlice == s.mAlice && mMask == s.mMask;
    }
  }

  @SuppressWarnings("unchecked")
  private List<Integer>[] buildMoves(final int n, final int[][] offsets) {
    final List<Integer>[] moves = new List[n * n];
    for (int i = 0; i < n * n; ++i) {
      moves[i] = new ArrayList<>();
      final int r = i / n;
      final int c = i % n;
      for (final int[] o : offsets) {
        final int nr = r + o[0];
        final int nc = c + o[1];
        if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
          moves[i].add(nr * n + nc);
        }
      }
    }
    return moves;
  }

  private int minimax(final int currentIdx,
                      final boolean aliceTurn,
                      final long visitedMask,
                      final List<Integer>[] aliceMovesMap,
                      final List<Integer>[] bobMovesMap,
                      final Map<State, Integer> memo) {

    final State state = new State(currentIdx, aliceTurn, visitedMask);
    final Integer cached = memo.get(state);
    if (cached != null) {
      return cached;
    }

    final List<Integer> moves = aliceTurn ? aliceMovesMap[currentIdx] : bobMovesMap[currentIdx];

    int best;
    boolean hasMove = false;
    if (aliceTurn) {
      best = 0;
      for (final int m : moves) {
        if ((visitedMask & (1L << m)) == 0) {
          hasMove = true;
          final int val = 1 + minimax(m, false, visitedMask | (1L << m), aliceMovesMap, bobMovesMap, memo);
          if (val > best) {
            best = val;
          }
        }
      }
    } else {
      best = Integer.MAX_VALUE;
      for (final int m : moves) {
        if ((visitedMask & (1L << m)) == 0) {
          hasMove = true;
          final int val = 1 + minimax(m, true, visitedMask | (1L << m), aliceMovesMap, bobMovesMap, memo);
          if (val < best) {
            best = val;
          }
        }
      }
    }
    if (!hasMove) {
      best = 0;
    }
    memo.put(state, best);
    return best;
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 8) {
      throw new UnsupportedOperationException("Need more than long for visited mask");
    }
    if (mN < 2) {
      return Z.ZERO;
    }
    final int startIdx = (mN - 1) * mN;
    final List<Integer>[] aliceMovesMap = buildMoves(mN, ALICE_OFFSETS);
    final List<Integer>[] bobMovesMap = buildMoves(mN, BOB_OFFSETS);
    return Z.valueOf(minimax(startIdx, true, 1L << startIdx, aliceMovesMap, bobMovesMap, new HashMap<>()));
  }

}
