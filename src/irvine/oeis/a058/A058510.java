package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a153.A153084;

/**
 * A058510 McKay-Thompson series of class 15C for Monster.
 * @author Sean A. Irvine
 */
public class A058510 extends PrependSequence {

  /** Construct the sequence. */
  public A058510() {
    super(new SkipSequence(new A153084(), 2), 1, 0);
  }
}
