package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a128.A128517;

/**
 * A058535 McKay-Thompson series of class 18E for Monster.
 * @author Sean A. Irvine
 */
public class A058535 extends PrependSequence {

  /** Construct the sequence. */
  public A058535() {
    super(new SkipSequence(new A128517(), 2), 1, 0);
  }
}
