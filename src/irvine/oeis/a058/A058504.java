package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a128.A128516;

/**
 * A058504 McKay-Thompson series of class 14C for Monster.
 * @author Sean A. Irvine
 */
public class A058504 extends PrependSequence {

  /** Construct the sequence. */
  public A058504() {
    super(new SkipSequence(new A128516(), 2), 1, 0);
  }
}
