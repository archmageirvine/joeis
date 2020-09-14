package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a176.A176143;

/**
 * A058516 McKay-Thompson series of class 16C for Monster.
 * @author Sean A. Irvine
 */
public class A058516 extends PrependSequence {

  /** Construct the sequence. */
  public A058516() {
    super(new SkipSequence(new A176143(), 2), 1, 0);
  }
}
