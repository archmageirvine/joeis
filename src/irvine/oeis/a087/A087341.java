package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A087341 Smallest prime which is a concatenation of n successive composite numbers.
 * @author Sean A. Irvine
 */
public class A087341 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long s = 3;
    while (true) {
      ++s;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0, t = s; k < mN; ++k, ++t) {
        if (Predicates.PRIME.is(t)) {
          ++t;
        }
        sb.append(t);
      }
      if ((sb.charAt(sb.length() - 1) & 1) == 1) {
        final Z u = new Z(sb);
        if (u.isProbablePrime()) {
          return u;
        }
      }
    }
  }
}

