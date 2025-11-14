package irvine.oeis.a081;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081847 a(1) = 1, a(n) = smallest positive number such that the concatenation of a(n-1) and a(n) is a triangular number not obtained earlier.
 * @author Sean A. Irvine
 */
public class A081847 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      long m = 0;
      while (true) {
        final long r = ++m % 10;
        if (r == 0 || r == 1 || r == 3 || r == 5 || r == 6 || r == 8) {
          final Z t = new Z(mA.toString() + m);
          if (Predicates.TRIANGULAR.is(t) && mSeen.add(t)) {
            mA = Z.valueOf(m);
            break;
          }
        }
      }
    }
    return mA;
  }
}

