package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022908 The sequence <code>M(n)</code> in <code>A022905</code>.
 * @author Sean A. Irvine
 */
public class A022908 extends A022907 {

  private long mN = 0;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 1) {
      mS = mS.add(super.next());
    }
    return mS.add(mN == 1 ? 0 : mN);
  }
}
