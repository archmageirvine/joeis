package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024180 <code>a(n) = floor(3rd</code> elementary symmetric function of <code>2,3,...,n+3)/ 2nd</code> elementary symmetric function of <code>(2,3,...,n+3) )</code>.
 * @author Sean A. Irvine
 */
public class A024180 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.add(9).multiply(mN).add(22)
      .multiply(mN + 5).multiply(mN)
      .divide(n.multiply(3).add(29).multiply(mN).add(72).multiply2());
  }
}
