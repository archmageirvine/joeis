package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024201 <code>[ (2nd</code> elementary symmetric function of <code>S(n))/(first</code> elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+1</code> odd positive integers}.
 * @author Sean A. Irvine
 */
public class A024201 extends A024196 {

  private long mN = 1;

  @Override
  public Z next() {
    return super.next().divide(++mN).divide(mN);
  }
}

