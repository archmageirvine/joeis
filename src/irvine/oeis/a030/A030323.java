package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030323 Number of 1's minus number of 0's in first n terms of A030317.
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

