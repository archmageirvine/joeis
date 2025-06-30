package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A074481 Triangle T(p,k) read by rows, where p runs through the primes and 1 &lt;= k &lt;= p-1. T(p,k) = 1 if the reverse of the base-k expansion of p is a prime, otherwise 0.
 * @author Sean A. Irvine
 */
public class A074481 extends AbstractSequence {

  private final A000040 mSeq = new A000040();
  private long mP = 1;
  private long mM = 0;

  /** Construct the sequence. */
  public A074481() {
    super(2);
  }

  @Override
  public Z next() {
    if (++mM >= mP) {
      mP = mSeq.next().longValueExact();
      mM = 1;
    }
    return Functions.REVERSE.z(mM, mP).isProbablePrime() ? Z.ONE : Z.ZERO;
  }
}

