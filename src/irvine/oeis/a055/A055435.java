package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055435 (1/18)*Difference between concatenation of n and n^2 and concatenation of n^2 and n.
 * @author Sean A. Irvine
 */
public class A055435 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final String n2 = Z.valueOf(++mN).square().toString();
    return new Z(mN + n2).subtract(new Z(n2 + mN)).divide(18);
  }
}
