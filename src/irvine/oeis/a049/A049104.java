package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049104 Numbers k such that k and k-1 both have 6 divisors.
 * @author Sean A. Irvine
 */
public class A049104 extends A049103 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

