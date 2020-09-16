package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a094.A094362;

/**
 * A058661 McKay-Thompson series of class 39C for Monster.
 * @author Sean A. Irvine
 */
public class A058661 extends PrependSequence {

  /** Construct the sequence. */
  public A058661() {
    super(new SkipSequence(new A094362(), 2), 1, 0);
  }
}
