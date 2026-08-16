package irvine.oeis.a320;
// manually 2026-08-15/treonk

import irvine.math.z.Z;
import irvine.oeis.a247.A247255;

/**
 * A320318 Number of weakly unimodal compositions of n in which the greatest part occurs exactly seven times.
 * @author Georg Fischer
 */
public class A320318 extends A247255 {

  private int mN = -1;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : super.triangleElement(mN, 7);
  }
}

