package irvine.oeis.a036;
// manually 2025-04-22

import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000225;

/**
 * A036987 Fredholm-Rueppel sequence.
 * @author Georg Fischer
 */
public class A036987 extends CharacteristicFunction implements DirectSequence {

  /** Construct the sequence. */
  public A036987() {
    super(0, new A000225());
  }

  @Override
  public Z a(final Z n) {
    return n.and(n.add(1)).isZero() ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return (n & (n + 1)) == 0 ? Z.ONE : Z.ZERO;
  }

}
