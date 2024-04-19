package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A110414 n! concatenated with n divided by n.
 * @author Georg Fischer
 */
public class A110414 extends Sequence1 {

  private int mN;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    return new Z(mF.toString() + mN).divide(mN);
  }
}
