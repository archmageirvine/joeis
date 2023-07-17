package irvine.oeis.a160;

import irvine.math.z.Z;

/**
 * A160793 Natural numbers and the sum of first n primes interleaved.
 * @author Sean A. Irvine
 */
public class A160793 extends A160792 {

  /** Construct the sequence. */
  public A160793() {
    super(1);
  }

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}

