package irvine.oeis.a078;
// Generated by gen_seq4.pl anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a014.A014695;
import irvine.oeis.a139.A139131;

/**
 * A078636 a(n) = rad(n*(n+1)).
 * @author Georg Fischer
 */
public class A078636 extends AbstractSequence {

  private final A139131 mSeq1 = new A139131();
  private final A014695 mSeq2 = new A014695();

  /** Construct the sequence. */
  public A078636() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
