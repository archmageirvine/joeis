package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071426.
 * @author Sean A. Irvine
 */
public class A071426 extends Sequence1 {

  // This implementation "plays" the octal game caching the Grundy-Sprague values
  // of each possible game state as it is visited.  This means it gets quite slow
  // and memory intensive for later value.
  // Most of these games are known to have a periodic structure (although the
  // period can be long).

  private final int[] mOctalGame;
  private int mN = 0;

  protected A071426(final String octalGame) {
    mOctalGame = new int[octalGame.length()];
    assert octalGame.charAt(0) == '.';
    // Skip position 0 which is "."
    for (int k = 1; k < octalGame.length(); ++k) {
      mOctalGame[k] = octalGame.charAt(k) - '0';
      assert mOctalGame[k] <= 7;
    }
  }

  /** Construct the sequence. */
  public A071426() {
    this(".11337");
  }

  private final MemoryFunction<List<Integer>, Integer> mGrundyFunction = new MemoryFunction<>() {
    @Override
    protected Integer compute(final List<Integer> key) {
      if (key.isEmpty()) {
        return 0;
      }
      final Set<Integer> seen = new HashSet<>();
      for (int take = 1; take < mOctalGame.length; ++take) {
        final int allowed = mOctalGame[take];
        if ((allowed & 1) != 0) {
          // If we can reduce a heap to 0, then that is a valid move
          for (int k = 0; k < key.size(); ++k) {
            if (key.get(k) == take) {
              final List<Integer> t = new ArrayList<>(key.subList(0, k));
              t.addAll(key.subList(k + 1, key.size()));
              seen.add(getValue(t));
            }
          }
        }
        if ((allowed & 2) != 0) {
          // If the heap is larger than take, then we can reduce the size of the heap
          for (int k = 0; k < key.size(); ++k) {
            if (key.get(k) > take) {
              final List<Integer> t = new ArrayList<>(key.subList(0, k));
              t.addAll(key.subList(k + 1, key.size()));
              t.add(key.get(k) - take);
              Collections.sort(t);
              seen.add(getValue(t));
            }
          }
        }
        if ((allowed & 4) != 0) {
          // If the heap is larger than take by at least 2, then we can split it
          for (int k = 0; k < key.size(); ++k) {
            if (key.get(k) > take + 1) {
              final int totalHeap = key.get(k) - take;
              // Now split into two heaps in all possible ways
              for (int split = 1; 2 * split <= totalHeap; ++split) {
                final List<Integer> t = new ArrayList<>(key.subList(0, k));
                t.addAll(key.subList(k + 1, key.size()));
                t.add(split);
                t.add(totalHeap - split);
                Collections.sort(t);
                seen.add(getValue(t));
              }
            }
          }
        }
      }
      return IntegerUtils.mex(seen);
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mGrundyFunction.getValue(Collections.singletonList(++mN)));
  }
}
