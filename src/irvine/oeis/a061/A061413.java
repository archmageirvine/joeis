package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061413 Coefficient values m resulting from A061412.
 * @author Sean A. Irvine
 */
public class A061413 extends Sequence0 {

  private int mN = 0;

  private int search(final int n) {
    int primeM = -1;
    for (int m = 1; m <= n; ++m) {
      if (Z.valueOf(m).shiftLeft(n).add(1).isProbablePrime()) {
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

