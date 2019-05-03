package irvine.oeis.a012;

import irvine.math.z.Z;

/**
 * A012250 <code>A012249(2n)</code> divided by <code>2^(2n-1)</code>.
 * @author Sean A. Irvine
 */
public class A012250 extends A012249 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return a(mN).shiftRight(mN - 1);
  }
}
