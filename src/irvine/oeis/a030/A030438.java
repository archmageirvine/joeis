package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030438 <code>a(n) = A030019(n)*n!</code> (or <code>A035051*(n-1)!)</code>.
 * @author Sean A. Irvine
 */
public class A030438 extends A030019 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}

