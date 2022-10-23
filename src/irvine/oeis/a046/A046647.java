package irvine.oeis.a046;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A046647 Number of certain rooted planar maps.
 * @author Sean A. Irvine
 */
public class A046647 extends Sequence2 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    } else {
      return mF.factorial(3 * mN - 6).multiply(7 * mN - 15).multiply(4)
        .divide(mF.factorial(2 * mN - 2)).divide(mF.factorial(mN - 2));
    }
  }
}
