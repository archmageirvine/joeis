package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a145.A145725;

/**
 * A058727 McKay-Thompson series of class 60C for Monster.
 * @author Sean A. Irvine
 */
public class A058727 extends PrependSequence {

  /** Construct the sequence. */
  public A058727() {
    super(new SkipSequence(new A145725(), 2), 1, 0);
  }
}
