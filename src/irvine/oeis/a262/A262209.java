package irvine.oeis.a262;
// Generated by gen_seq4.pl trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002654;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A262209 Inverse M\u00f6bius transform of A002654.
 * @author Georg Fischer
 */
public class A262209 extends AbstractSequence {

  private final InverseMobiusTransformSequence mSeq1 = new InverseMobiusTransformSequence(new A002654(), 0);

  /** Construct the sequence. */
  public A262209() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
