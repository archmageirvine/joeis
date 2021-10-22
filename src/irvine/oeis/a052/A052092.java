package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052092 Lengths of the palindromic primes from Honaker's sequence A053600.
 * @author Sean A. Irvine
 */
public class A052092 implements Sequence {

  private StringBuilder mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new StringBuilder("2");
      return Z.ONE;
    }
    long k = 0;
    while (true) {
      final StringBuilder rev = new StringBuilder().append(++k).reverse();
      if ((rev.charAt(rev.length() - 1) & 1) == 1) {
        final StringBuilder t = new StringBuilder().append(k).append(mA).append(rev);
        final Z a = new Z(t);
        if (a.isProbablePrime()) {
          mA = t;
          return Z.valueOf(t.length());
        }
      }
    }
  }
}

