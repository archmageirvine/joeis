package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390378 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A390378 extends Sequence0 {

  private int mN = -1;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    final Z pn = Functions.PRIMORIAL_COUNT.z(++mN);
    while (pn.compareTo(mM) >= 0) {
      mM = mM.multiply(10);
    }
    int k = mN;
    while (true) {
      Z pk = Functions.PRIMORIAL_COUNT.z(++k);
      while (pk.compareTo(pn) >= 0) {
        if (pk.mod(mM).equals(pn)) {
          return Z.valueOf(k);
        }
        pk = pk.divide(10);
      }
    }
  }
}

