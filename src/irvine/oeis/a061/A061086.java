package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061086 a(n) is the concatenation of n with n^3.
 * @author Georg Fischer
 */
public class A061086 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n3 = Z.valueOf(mN).multiply(mN).multiply(mN);
    return new Z(mN + n3.toString());
  }
}
