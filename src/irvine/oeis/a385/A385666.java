package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a022.A022553;
import irvine.oeis.triangle.Triangle;

/**
 * A385666 Triangle read by rows: T(n,k) is the number of 2n-bead balanced binary necklaces with period length 2n/k.
 * @author Gregory Morse
 */
public class A385666 extends Triangle {
  private final DirectSequence mPrimitive = DirectSequence.create(new A022553());

  /** Construct the sequence. */
  public A385666() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return (n + 1) % (k + 1) == 0 ? mPrimitive.a((n + 1) / (k + 1)) : Z.ZERO;
  }
}
