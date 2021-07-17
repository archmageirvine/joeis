package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048984 As n runs through composite numbers, a(n) = number of nonprime d &lt; n such that gcd(d,n) = 1.
 * @author Sean A. Irvine
 */
public class A048984 extends A048983 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

