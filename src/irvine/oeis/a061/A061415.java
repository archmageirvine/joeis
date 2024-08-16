package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061415 Coefficient values m resulting from A061414.
 * @author Sean A. Irvine
 */
public class A061415 extends Sequence1 {

  private int mN = 7;

  private int search(final int n) {
    int primeM = -1;
    for (int m = 1; m <= n; ++m) {
      if (Z.valueOf(m).shiftLeft(n).subtract(1).isProbablePrime()) {
        if (primeM >= 0) {
          return -1;
        }
        primeM = m;
      }
    }
    return primeM;
  }

  @Override
  public Z next() {
    while (true) {
      final int primeM = search(++mN);
      if (primeM >= 0) {
        return Z.valueOf(primeM);
      }
    }
  }
}

