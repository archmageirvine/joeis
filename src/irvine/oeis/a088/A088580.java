package irvine.oeis.a088;

import irvine.factor.factor.Jaguar;
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
    return Jaguar.factor(++mN).sigma().add(1);
  }

  @Override
  public Z a(final int n) {
    return Jaguar.factor(n).sigma().add(1);
  }

  @Override
  public Z a(final Z n) {
    return Jaguar.factor(n).sigma().add(1);
  }
}
