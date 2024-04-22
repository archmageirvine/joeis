package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000217 Triangular numbers: a(n) = binomial(n+1,2) = n*(n+1)/2 = 0 + 1 + 2 + ... + n.
 * @author Sean A. Irvine
 */
public class A000217 extends AbstractSequence implements DirectSequence {

  /** Construct the sequence. */
  public A000217() {
    super(0);
  }

  /**
   * Construct with different offset.
   * @param offset first index of subclass
   */
  public A000217(final int offset) {
    super(offset);
  }

  protected long mN = -1;

  @Override
  public Z a(final Z n) {
    return Functions.TRIANGULAR.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.TRIANGULAR.z(n);
  }

  @Override
  public Z next() {
    final long n = ++mN;
    return Functions.TRIANGULAR.z(n);
  }
}

