package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053600 a(1) = 2; for n&gt;=1, a(n+1) is the smallest palindromic prime with a(n) as a central substring.
 * @author Sean A. Irvine
 */
public class A053600 implements Sequence {

  private StringBuilder mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new StringBuilder("2");
      return Z.TWO;
    }
    long k = 0;
    while (true) {
      final StringBuilder rev = new StringBuilder().append(++k).reverse();
      if ((rev.charAt(rev.length() - 1) & 1) == 1) {
        final StringBuilder t = new StringBuilder().append(k).append(mA).append(rev);
        final Z a = new Z(t);
        if (a.isProbablePrime()) {
          mA = t;
          return a;
        }
      }
    }
  }
}

