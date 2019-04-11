package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187272 <code>a(n) = (n/4)*2^(n/2)*((1+sqrt(2))^2 + (-1)^n*(1-sqrt(2))^2)</code>.
 * @author Sean A. Irvine
 */
public class A187272 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.valueOf(3L * mN).shiftLeft(mN / 2 - 1) : Z.valueOf(mN).shiftLeft(mN / 2 + 1);
  }
}

