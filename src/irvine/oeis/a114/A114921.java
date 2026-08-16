package irvine.oeis.a114;
// manually 2026-08-15/treonk

import irvine.math.z.Z;
import irvine.oeis.a247.A247255;

/**
 * A114921 Number of unimodal compositions of n+2 where the maximal part appears exactly twice.
 * @author Georg Fischer
 */
public class A114921 extends A247255 {

  private int mN = -1;

  /** Construct the sequence. */
  public A114921() {
    setOffset(0);
    next();
    next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.triangleElement(mN, 2);
  }
}

