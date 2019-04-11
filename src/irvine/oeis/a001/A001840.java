package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001840 Expansion of <code>x /((1 - x)^2 * (1 - x^3))</code>.
 * @author Sean A. Irvine
 */
public class A001840 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + mN % 3).multiply(mN / 3 + 1).divide(2);
  }
}
