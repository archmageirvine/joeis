package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a001.A001815;

/**
 * A003013 E.g.f. <code>1+x*exp(x)+x^2*exp(2*x)</code>.
 * @author Sean A. Irvine
 */
public class A003013 extends A001815 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().add(Math.max(1, ++mN));
  }
}
