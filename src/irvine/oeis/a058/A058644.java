package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a227.A227585;

/**
 * A058644 McKay-Thompson series of class 36A for Monster.
 * @author Sean A. Irvine
 */
public class A058644 extends PrependSequence {

  /** Construct the sequence. */
  public A058644() {
    super(new SkipSequence(new A227585(), 2), 1, 0);
  }
}
