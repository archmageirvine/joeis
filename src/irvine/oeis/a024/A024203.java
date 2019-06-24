package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024203 <code>[ (4th</code> elementary symmetric function of <code>S(n))/(first</code> elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+3</code> odd positive integers}.
 * @author Sean A. Irvine
 */
public class A024203 extends A024198 {

  private long mN = 3;

  @Override
  public Z next() {
    return super.next().divide(++mN).divide(mN);
  }
}

