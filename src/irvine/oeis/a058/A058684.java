package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a226.A226054;

/**
 * A058684 McKay-Thompson series of class 45A for Monster.
 * @author Sean A. Irvine
 */
public class A058684 extends PrependSequence {

  /** Construct the sequence. */
  public A058684() {
    super(new SkipSequence(new A226054(), 2), 1, 0);
  }
}
