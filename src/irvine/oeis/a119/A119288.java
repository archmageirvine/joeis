package irvine.oeis.a119;
// manually 2026-03-30

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a028.A028234;

/**
 * A119288 a(n) is the second smallest prime factor of n, or 1 if n is a prime power.
 * @author Georg Fischer
 */
public class A119288 extends AbstractSequence implements DirectSequence {

  private long mN;
  private static final DirectSequence A028234 = new A028234();

  /** Construct the sequence. */
  public A119288() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.LPF.z(A028234.a(n));
  }

  @Override
  public Z a(final long n) {
    return Functions.LPF.z(A028234.a(n));
  }

}
