package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030323 Number of <code>1</code>'s minus number of <code>0</code>'s in first n terms of <code>A030317</code>.
 * @author Sean A. Irvine
 */
public class A030323 extends A030317 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.signedAdd(Z.ONE.equals(super.next()), Z.ONE);
    return mSum;
  }
}

