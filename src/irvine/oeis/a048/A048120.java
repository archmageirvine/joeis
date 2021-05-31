package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048120 a(n)=T(2n,n+1), where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048120 extends A048113 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
