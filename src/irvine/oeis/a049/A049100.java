package irvine.oeis.a049;

import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A049100 a(n) = Euler phi function applied 4 times to n.
 * @author Sean A. Irvine
 */
public class A049100 extends A049099 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}

