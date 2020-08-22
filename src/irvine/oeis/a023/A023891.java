package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023891 Sum of composite divisors of n.
 * @author Sean A. Irvine
 */
public class A023891 extends A023890 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

