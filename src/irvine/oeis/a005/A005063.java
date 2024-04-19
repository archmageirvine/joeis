package irvine.oeis.a005;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A005063 Sum of squares of primes dividing n.
 * @author Sean A. Irvine
 */
public class A005063 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final int mE; // exponent for p

  /** Construct the sequence. */
  public A005063() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param e exponent of p
   */
  public A005063(final int offset, final int e) {
    super(offset);
    mN = offset - 1;
    mE = e;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.sopf(n, p -> Z.valueOf(p).pow(mE));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

