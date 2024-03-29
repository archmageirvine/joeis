package irvine.oeis.a344;
// Generated by gen_seq4.pl trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a011.A011772;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A344767 M\u00f6bius transform of A011772.
 * @author Georg Fischer
 */
public class A344767 extends AbstractSequence {

  private final MobiusTransformSequence mSeq1 = new MobiusTransformSequence(new A011772(), 0);

  /** Construct the sequence. */
  public A344767() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
