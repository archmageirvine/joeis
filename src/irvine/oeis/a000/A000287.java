package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000287 Number of rooted polyhedral graphs with n edges.
 * @author Sean A. Irvine
 */
public class A000287 extends AbstractSequence {

  /** Construct the sequence. */
  public A000287() {
    super(6);
  }

  private Z mR = Z.TWO;
  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    final Z nn = Z.valueOf(mN).square();
    mR = Functions.FACTORIAL.z(2 * mN).multiply2().divide(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mN))
      .subtract(nn.multiply(27).add(9L * mN - 2).multiply(mR))
      .divide(nn.multiply(54).add(32 - 90L * mN));

    return mR.add((mN & 1) == 0 ? -2 : 2);
  }
}
