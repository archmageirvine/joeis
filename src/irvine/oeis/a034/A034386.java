package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A034386 Primorial numbers (second definition): n# = product of primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A034386 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A034386(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A034386() {
    super(0);
  }

  private final Fast mPrime = new Fast();
  private Z mPrimorial = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      mPrimorial = mPrimorial.multiply(mN);
    }
    return mPrimorial;
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIMORIAL.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIMORIAL.z(n);
  }

}
