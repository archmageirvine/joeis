package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000262;

/**
 * A006152 Exponential generating function <code>x*exp(x/(1-x))</code>.
 * @author Sean A. Irvine
 */
public class A006152 extends A000262 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}

