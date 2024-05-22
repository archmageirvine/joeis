package irvine.oeis.a088;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A088580 a(n) = 1 + sigma(n).
 * @author Georg Fischer
 */
public class A088580 extends AbstractSequence implements DirectSequence {

  /** Construct the sequence. */
  public A088580() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA1.z(++mN).add(1);
  }

  @Override
  public Z a(final int n) {
    return Functions.SIGMA1.z(n).add(1);
  }

  @Override
  public Z a(final Z n) {
    return Functions.SIGMA1.z(n).add(1);
  }
}
