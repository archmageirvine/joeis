package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a187.A187198;

/**
 * A058486 McKay-Thompson series of class 12H for Monster.
 * @author Sean A. Irvine
 */
public class A058486 extends PrependSequence {

  /** Construct the sequence. */
  public A058486() {
    super(new SkipSequence(new A187198(), 2), 1, 0);
  }
}
