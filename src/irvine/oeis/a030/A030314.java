package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030314.
 * @author Sean A. Irvine
 */
public class A030314 extends A030308 {

  private Z mSum = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    mSum = mSum.signedAdd(Z.ONE.equals(super.next()), Z.ONE);
    return mSum;
  }
}

