package irvine.oeis.a230;
// Generated by gen_seq4.pl trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.transform.BoustrophedonTransformSequence;

/**
 * A230961 Boustrophedon transform of factorials beginning with 1, cf. A000142.
 * @author Georg Fischer
 */
public class A230961 extends AbstractSequence {

  private final BoustrophedonTransformSequence mSeq1 = new BoustrophedonTransformSequence(new A000142().skip(1));

  /** Construct the sequence. */
  public A230961() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
