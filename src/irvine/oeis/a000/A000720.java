package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000720 pi(n), the number of primes &lt;= n. Sometimes called PrimePi(n) to distinguish it from the number 3.14159...
 * @author Sean A. Irvine
 */
public class A000720 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000720(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000720() {
    super(1);
  }

  protected Z mN = Z.ZERO;
  private Z mP = Z.ZERO;

  @Override
  public Z a(final Z n) {
    return Functions.PRIME_PI.z(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isPrime()) {
      mP = mP.add(1);
    }
    return mP;
  }
}
