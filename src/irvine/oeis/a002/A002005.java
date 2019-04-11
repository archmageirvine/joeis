package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A002005 Number of rooted planar cubic maps with <code>2n</code> vertices.
 * @author Sean A. Irvine
 */
public class A002005 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mF.doubleFactorial(3 * mN).shiftLeft(2 * mN + 1).divide(mF.factorial(mN + 2)).divide(mF.doubleFactorial(mN));
  }
}
