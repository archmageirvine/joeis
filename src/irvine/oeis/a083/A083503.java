package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083503 Basis of the n-th power arising in A083502.
 * @author Sean A. Irvine
 */
public class A083503 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN).subtract(1);
      if (t.mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
