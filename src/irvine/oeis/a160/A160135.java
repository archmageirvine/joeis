package irvine.oeis.a160;
// manually 2025-08-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a051.A051377;

/**
 * A160135 Sum of non-exponential divisors of n.
 * @author Georg Fischer
 */
public class A160135 extends AbstractSequence implements DirectSequence {

  private int mN = 0;
  private final DirectSequence mA051377 = new A051377();

  /** Construct the sequence. */
  public A160135() {
    super(1);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n.isOne() ? Z.ONE : Functions.SIGMA1.z(n).subtract(mA051377.a(n));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
