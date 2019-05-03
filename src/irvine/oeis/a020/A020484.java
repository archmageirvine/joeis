package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020484 Least prime p such that there exists a prime q with <code>p-2n =</code> q.
 * @author Sean A. Irvine
 */
public class A020484 extends A020483 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
