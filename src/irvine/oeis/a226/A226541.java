package irvine.oeis.a226;
// manually 2026-08-15/treonk

import irvine.math.z.Z;
import irvine.oeis.a247.A247255;

/**
 * A226541 Number of unimodal compositions of n where the maximal part appears three times.
 * @author Georg Fischer
 */
public class A226541 extends A247255 {

  private int mN = -1;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : super.triangleElement(mN, 3);
  }
}

