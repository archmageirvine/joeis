package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A003415 a(n) = n' = arithmetic derivative of n: a(0) = a(1) = 0, a(prime) = 1, a(m*n) = m*a(n) + n*a(m).
 * @author Sean A. Irvine
 */
public class A003415 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003415(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003415() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.ARD.z(++mN);
  }

  @Override
  public Z a(final int n) {
    return Functions.ARD.z(n);
  }

  @Override
  public Z a(final Z n) {
    return Functions.ARD.z(n);
  }
}
