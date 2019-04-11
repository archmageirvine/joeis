package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000911 <code>a(n) = (2n+3)! /( n! * (n+1)! )</code>.
 * @author Sean A. Irvine
 */
public class A000911 implements Sequence {

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

