package irvine.oeis.a051;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Quadruple;

/**
 * A051706.
 * @author Sean A. Irvine
 */
public class A051706 implements Sequence {

  // See https://en.wikipedia.org/wiki/Tennis_scoring_system

  // todo sa,sb is actually "games" (if get 2 games ahead you gain a "set")

//  private static final class Score {
//    private final int[] mScore = new int[6];
//
//
//  }

  private Set<Quadruple<Integer>> mScores = null;

  @Override
  public Z next() {
    if (mScores == null) {
      mScores = Collections.singleton(new Quadruple<>(0, 0, 0, 0));
    } else {
      final HashSet<Quadruple<Integer>> next = new HashSet<>();
      for (final Quadruple<Integer> p : mScores) {
        final int a = p.a();
        final int b = p.b();
        final int sa = p.c();
        final int sb = p.d();
        //if (sa + sb < 3 || Math.abs(sa - sb) < 2) {
          if ((a < 3 && b < 3) || (a == b)) {
            next.add(new Quadruple<>(a + 1, b, sa, sb)); // a's point
            next.add(new Quadruple<>(a, b + 1, sa, sb)); // b's point
          } else if (a < b) {
            next.add(new Quadruple<>(a + 1, b, sa, sb)); // a's point
            if (sb < 2 || sa >= sb) {
              next.add(new Quadruple<>(0, 0, sa, sb + 1)); // b's set
            }
          } else {
            assert b > a;
            if (sa < 2 || sb >= sa) {
              next.add(new Quadruple<>(0, 0, sa + 1, sb)); // a's set
            }
            next.add(new Quadruple<>(a, b + 1, sa, sb)); // b's point
          }
      //  }
      }
      mScores = next;
      //System.out.println(mScores);
    }
    return Z.valueOf(mScores.size());
  }
}
