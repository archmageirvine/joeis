package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005044 Alcuin's sequence: expansion of <code>x^3/((1-x^2)*(1-x^3)*(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A005044 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).square().add(6).divide(12).subtract(Z.valueOf(mN / 4).multiply((mN + 2) / 4));
  }
}
