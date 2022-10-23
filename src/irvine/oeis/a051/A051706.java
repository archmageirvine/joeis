package irvine.oeis.a051;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051706 Number of different tennis scores after n points have been played.
 * @author Sean A. Irvine
 */
public class A051706 extends Sequence0 {

  // See https://en.wikipedia.org/wiki/Tennis_scoring_system

  private static final class Score {
    private final int[] mScore;
    
    private Score(final int... scores) {
      mScore = scores;
      // Deuce correction
      if (mScore[0] == mScore[1] && mScore[0] > 3) {
        mScore[0] = 3;
        mScore[1] = 3;
      }
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mScore);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Score && Arrays.equals(mScore, ((Score) obj).mScore);
    }

    @Override
    public String toString() {
      return Arrays.toString(mScore);
    }
    
    private int a() {
      return mScore[0];
    }
    
    private int b() {
      return mScore[1];
    }
    
    private int gamesA() {
      return mScore[2];
    }
    
    private int gamesB() {
      return mScore[3];
    }
    
    private int setsA() {
      return mScore[4];
    }
    
    private int setsB() {
      return mScore[5];
    }
  }

  private Set<Score> mScores = null;

  @Override
  public Z next() {
    if (mScores == null) {
      mScores = Collections.singleton(new Score(0, 0, 0, 0, 0, 0));
    } else {
      final HashSet<Score> next = new HashSet<>();
      for (final Score p : mScores) {
        final int a = p.a();
        final int b = p.b();
        final int gamesA = p.gamesA();
        final int gamesB = p.gamesB();
        final int setsA = p.setsA();
        final int setsB = p.setsB();
        if ((a < 3 && b < 3) || (a == b)) {
          next.add(new Score(a + 1, b, gamesA, gamesB, setsA, setsB)); // a's point
          next.add(new Score(a, b + 1, gamesA, gamesB, setsA, setsB)); // b's point
        } else if (a < b) {
          next.add(new Score(a + 1, b, gamesA, gamesB, setsA, setsB)); // a's point
          if (gamesB < 5 || gamesA >= gamesB) {
            next.add(new Score(0, 0, gamesA, gamesB + 1, setsA, setsB)); // b's game
          } else {
            next.add(new Score(0, 0, 0, 0, setsA, setsB + 1)); // b's set
          }
        } else {
          if (gamesA < 5 || gamesB >= gamesA) {
            next.add(new Score(0, 0, gamesA + 1, gamesB, setsA, setsB)); // a's game
          } else {
            next.add(new Score(0, 0, 0, 0, setsA + 1, setsB)); // a's set
          }
          next.add(new Score(a, b + 1, gamesA, gamesB, setsA, setsB)); // b's point
        }
      }
      mScores = next;
    }
    return Z.valueOf(mScores.size());
  }
}
