package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000287 Number of rooted polyhedral graphs with n edges.
 * @author Sean A. Irvine
 */
public class A000287 extends AbstractSequence {

  /* Construct the sequence. */
  public A000287() {
    super(6);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Z mR = Z.TWO;
  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    final Z nn = Z.valueOf(mN).square();
    mR = mF.factorial(2 * mN).multiply2().divide(mF.factorial(mN)).divide(mF.factorial(mN))
      .subtract(nn.multiply(27).add(9 * mN - 2).multiply(mR))
      .divide(nn.multiply(54).add(32 - 90 * mN));

    return mR.add((mN & 1) == 0 ? -2 : 2);
  }
}
