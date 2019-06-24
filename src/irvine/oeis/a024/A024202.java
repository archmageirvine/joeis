package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024202 <code>a(n) = [ (3rd</code> elementary symmetric function of <code>S(n))/(first</code> elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+2</code> odd positive integers}.
 * @author Sean A. Irvine
 */
public class A024202 extends A024197 {

  private long mN = 2;

  @Override
  public Z next() {
    return super.next().divide(++mN).divide(mN);
  }
}

