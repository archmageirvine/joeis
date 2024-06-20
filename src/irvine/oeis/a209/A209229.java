package irvine.oeis.a209;
// manually 2024-06-20

import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000079;

/**
 * A209229 Characteristic function of powers of 2, cf. A000079.
 * @author Georg Fischer
 */
public class A209229 extends CharacteristicFunction implements DirectSequence {

 
  /** Construct the sequence. */
  public A209229() {
    super(0, new A000079());
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : ((n.bitCount() == 1) ? Z.ONE : Z.ZERO);
  }

  @Override
  public Z a(final int n) {
    return (n == 0) ? Z.ZERO : ((Integer.bitCount(n) == 1) ? Z.ONE : Z.ZERO);
  }

}
