package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a132.A132320;

/**
 * A058568 McKay-Thompson series of class 22B for Monster.
 * @author Sean A. Irvine
 */
public class A058568 extends PrependSequence {

  /** Construct the sequence. */
  public A058568() {
    super(new SkipSequence(new A132320(), 2), 1, 0);
  }
}
