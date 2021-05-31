package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048118 a(n)=T(2n+1,n+1), where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048118 extends A048113 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
