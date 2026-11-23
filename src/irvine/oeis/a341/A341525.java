package irvine.oeis.a341;
// manually 2026-11-22

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003961;

/**
 * A341525 Numerator of A003973(n) / A003961(n).
 * @author Georg Fischer
 */
public class A341525 extends AbstractSequence implements DirectSequence {

  private final DirectSequence mSeq;

  /** Construct the sequence. */
  public A341525() {
    super(1);
    mSeq = new A003961();
  }

  @Override
  public Z next() {
    final Z t61 = mSeq.next();
    return new Q(Functions.SIGMA.z(t61), t61).num();
  }

  @Override
  public Z a(final Z n) {
    final Z t61 = mSeq.a(n);
    return new Q(Functions.SIGMA.z(t61), t61).num();
  }

  @Override
  public Z a(final long n) {
    final Z t61 = mSeq.a(n);
    return new Q(Functions.SIGMA.z(t61), t61).num();
  }

}
