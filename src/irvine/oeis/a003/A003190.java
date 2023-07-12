package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.polynomial.PalmerSymPowerCycleIndex;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A003190 Number of connected 2-plexes.
 * @author Sean A. Irvine
 */
public class A003190 extends MemoryFunction2Sequence<Integer, Q> {

  /** Construct the sequence. */
  public A003190() {
    super(1);
  }

  // This is close, but currently differs from existing sequence in later terms
  // It is unclear if this implementation or the original results are wrong.
  // In particular, for the monomial a_3a_4 I get a_1a_4a_6a_{12}^2, but it
  // looks like the papers has a_1a_2^3a_4^7.  Tracing this further, the
  // difference occurs in the calculation of M2 where I get a_6a_{12}^2 and
  // it apparently should be a_2^3a_4^6.
  //
  // Extra evidence that my implementation is correct comes from A000665 which
  // is the Euler transform of this sequence.

  private int mN = 0;

  private final PalmerSymPowerCycleIndex mSym = new PalmerSymPowerCycleIndex();

  @Override
  protected Q compute(final Integer n, final Integer p) {
    Q s = Q.ZERO;
    for (int k = 1; k < p; ++k) {
      s = s.add(mSym.get(n, p - k).multiply(get(n, k)).multiply(k));
    }
    return mSym.get(n, p).subtract(s.divide(p));
  }

  protected Z c(final int n, final int p) {
    Q s = Q.ZERO;
    for (final Z dd : Jaguar.factor(p).divisors()) {
      final int d = dd.intValueExact();
      s = s.add(get(n, p / d).multiply(Mobius.mobius(d)).divide(d));
    }
    assert s.isInteger();
    return s.toZ();
  }

  @Override
  public Z next() {
    return c(2, ++mN);
  }
}
