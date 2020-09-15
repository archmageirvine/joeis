package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a226.A226009;

/**
 * A058636 McKay-Thompson series of class 33A for Monster.
 * @author Sean A. Irvine
 */
public class A058636 extends PrependSequence {

  /** Construct the sequence. */
  public A058636() {
    super(new SkipSequence(new A226009(), 2), 1, 0);
  }
}
