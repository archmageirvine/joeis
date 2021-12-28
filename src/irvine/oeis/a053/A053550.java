package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.transform.RevertTransformSequence;

/**
 * A053550 Reversion of [1,2,12,152,3640,...] (A053549).
 * @author Sean A. Irvine
 */
public class A053550 extends RevertTransformSequence {

  private boolean mSign = false;

  /** Construct the sequence. */
  public A053550() {
    super(new SkipSequence(new A053549(), 1));
  }

  @Override
  public Z next() {
    mSign = !mSign;
    return mSign ? super.next() : super.next().negate();
  }
}
