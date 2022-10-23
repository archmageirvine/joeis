package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000911 a(n) = (2n+3)! /( n! * (n+1)! ).
 * @author Sean A. Irvine
 */
public class A000911 extends Sequence0 {

  private long mN = -1;
  private Z mS = Z.SIX;

  @Override
  public Z next() {
    if (++mN > 0) {
      mS = mS.multiply(2 * mN + 3).multiply2().divide(mN);
    }
    return mS;
  }
}

