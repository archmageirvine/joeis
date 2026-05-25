package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085008 a(n)=9*A085007(n)-11*n.
 * @author Sean A. Irvine
 */
public class A085008 extends A085007 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 11;
    return super.next().multiply(9).subtract(mN);
  }
}
