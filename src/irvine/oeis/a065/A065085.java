package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065084.
 * @author Sean A. Irvine
 */
public class A065085 extends Sequence0 {

  // After Washington Bomfim

  private int mN = -1;

  @Override
  public Z next() {
    switch (++mN) {
      case 0:
        return Z.THREE;
      case 1:
        return Z.TWO;
      default:
        if (mN % 3 == 0) {
          return Z.ZERO;
        }
        // ii
        Z i = Z.ONE.shiftLeft(2L * mN).subtract(1).divide(3).multiply2().add(1).add(Z.ONE.shiftLeft(2L * mN + 1));
        if (i.isProbablePrime()) {
          return i;
        }
        // iii
        Z w = Z.ONE.shiftLeft(2L * mN + 3);
        for (int j = 1; j <= mN + 1; ++j) {
          i = i.add(w);
          w = w.divide(4);
          i = i.subtract(w);
          if (i.isProbablePrime()) {
            return i;
          }
        }
        // iv
        i = i.add(6);
        if (i.isProbablePrime()) {
          return i;
        }
        w = Z.FOUR;
        for (int j = 1; j <= mN; ++j) {
          i = i.subtract(w);
          w = w.multiply(4);
          i = i.add(w);
          if (i.isProbablePrime()) {
            return i;
          }
        }
        // v
        i = i.add(Z.ONE.shiftLeft(2L * mN + 4)).subtract(Z.ONE.shiftLeft(2L * mN + 2));
        if (i.isProbablePrime()) {
          return i;
        }
        w = i.add(Z.ONE.shiftLeft(2L * mN + 5)).subtract(Z.ONE.shiftLeft(2L * mN + 4));
        i = w.subtract(Z.ONE.shiftLeft(2L * mN + 3)).subtract(Z.ONE.shiftLeft(2L * mN + 1));
        if (i.isProbablePrime()) {
          return i;
        }
        w = Z.ONE.shiftLeft(2L * mN + 1);
        for (int j = 1; j <= mN; ++j) {
          i = i.add(w);
          w = w.divide(4);
          i = i.subtract(4);
          if (i.isProbablePrime()) {
            return i;
          }
        }
        throw new UnsupportedOperationException();
    }
  }
}
