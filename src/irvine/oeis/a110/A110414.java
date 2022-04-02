package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110414 n! concatenated with n divided by n.
 * @author Georg Fischer
 */
public class A110414 implements Sequence {

  private int mN;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    return new Z(mF.toString() + String.valueOf(mN)).divide(mN);
  }
}
