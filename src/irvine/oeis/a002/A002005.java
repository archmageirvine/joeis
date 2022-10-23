package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002005 Number of rooted planar cubic maps with 2n vertices.
 * @author Sean A. Irvine
 */
public class A002005 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mF.doubleFactorial(3 * mN).shiftLeft(2 * mN + 1).divide(mF.factorial(mN + 2)).divide(mF.doubleFactorial(mN));
  }
}
