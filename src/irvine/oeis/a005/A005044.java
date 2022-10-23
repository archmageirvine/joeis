package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005044 Alcuin's sequence: expansion of x^3/((1-x^2)*(1-x^3)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A005044 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).square().add(6).divide(12).subtract(Z.valueOf(mN / 4).multiply((mN + 2) / 4));
  }
}
