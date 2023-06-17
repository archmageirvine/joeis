package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A004152 Sum of digits of n!.
 * @author Sean A. Irvine
 */
public class A004152 extends AbstractSequence {

  /* Construct the sequence. */
  public A004152() {
    super(0);
  }

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return Z.valueOf(ZUtils.digitSum(mF));
  }
}
