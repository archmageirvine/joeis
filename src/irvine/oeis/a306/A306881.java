package irvine.oeis.a306;
// Generated by patch_prepend.pl 2023-06-19 07:19

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000169;
import irvine.oeis.transform.BoustrophedonTransformSequence;

/**
 * A306881 Expansion of e.g.f. -(sec(x) + tan(x))*LambertW(-x).
 * @author Georg Fischer
 */
public class A306881 extends AbstractSequence {

  private final BoustrophedonTransformSequence mSeq1 = new BoustrophedonTransformSequence(new PrependSequence(new A000169(), 0));

  /** Construct the sequence. */
  public A306881() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
