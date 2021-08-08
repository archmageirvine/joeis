package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049847 a(n) = (2*n + 1 - prevprime(2*n+1))/2.
 * @author Sean A. Irvine
 */
public class A049847 extends A049716 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
