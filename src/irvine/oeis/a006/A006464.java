package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a004.A004200;

/**
 * A006464 Continued fraction for <code>Sum_{n&gt;=0} 1/4^(2^n)</code>.
 * @author Sean A. Irvine
 */
public class A006464 extends A004200 {

  @Override
  public Z next() {
    final Z s = super.next();
    return s.add(s.signum());
  }
}
