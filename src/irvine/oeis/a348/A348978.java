package irvine.oeis.a348;
// Generated by gen_seq4.pl 2023-09-29/gcd3an at 2023-10-03 20:19

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a332.A332993;

/**
 * A348978 Numerator of ratio A332993(n) / sigma(n).
 * @author Georg Fischer
 */
public class A348978 extends AbstractSequence {

  private final AbstractSequence mSeq1 = new A332993();
  private final AbstractSequence mSeq2 = new A000203();

  /** Construct the sequence. */
  public A348978() {
    super(1);
  }

  @Override
  public Z next() {
    return new Q(mSeq1.next(), mSeq2.next()).num();
  }
}

