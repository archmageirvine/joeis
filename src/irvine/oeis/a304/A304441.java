package irvine.oeis.a304;

import irvine.oeis.a082.A082982;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A304441 Numbers k such that 8k, 8k+1 and 8k+2 are the sum of two squares; A082982 / 8.
 * @author Sean A. Irvine
 */
public class A304441 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A304441() {
    super(new A082982(), k -> k.divide(8));
  }
}
