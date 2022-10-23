package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A092659 Absolute value of difference between counts of uninterrupted runs of 8 primes in A092657 and A092658.
 * @author Sean A. Irvine
 */
public class A092659 extends Sequence1 {

  private final A092657 mA = new A092657();
  private final A092658 mB = new A092658();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next()).abs();
  }
}

