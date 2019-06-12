package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023889 Sum of prime power divisors of <code>n</code> (not including <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A023889 extends A023888 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

