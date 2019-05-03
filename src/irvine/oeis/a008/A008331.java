package irvine.oeis.a008;

import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A008331 <code>phi(p+1)</code>, p prime.
 * @author Sean A. Irvine
 */
public class A008331 extends A008864 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}


