package irvine.oeis.a334;

import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000240;
import irvine.oeis.transform.ExponentialRevertTransformSequence;


/**
 * A334316 E.g.f. A(x) satisfies: A(x) = x * exp(A(x)) * (1 - A(x)).
 * @author Georg Fischer
 */
public class A334316 extends ExponentialRevertTransformSequence implements SequenceWithOffset {

  /** Construct the sequence. */
  public A334316() {
    super(new A000240());
  }

  @Override
  public int getOffset() {
    return 1;
  }
}
