package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110415 a(n) = n concatenated with n! divided by n.
 * @author Georg Fischer
 */
public class A110415 implements Sequence {

  private int mN;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    return new Z(mN + mF.toString()).divide(mN);
  }
}
