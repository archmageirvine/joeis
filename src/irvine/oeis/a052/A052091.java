package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052091 Left parts needed for the construction of the palindromic prime pyramid starting with 2.
 * @author Sean A. Irvine
 */
public class A052091 extends Sequence0 {

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
          return Z.valueOf(k);
        }
      }
    }
  }
}

