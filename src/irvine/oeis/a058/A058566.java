package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a226.A226015;

/**
 * A058566 McKay-Thompson series of class 21D for Monster.
 * @author Sean A. Irvine
 */
public class A058566 extends PrependSequence {

  /** Construct the sequence. */
  public A058566() {
    super(new SkipSequence(new A226015(), 2), 1, 0);
  }
}
