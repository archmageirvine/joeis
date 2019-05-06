package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021058 Decimal expansion of 1/54.
 * @author Sean A. Irvine
 */
public class A021058 extends PrependSequence {

  /** Construct the sequence. */
  public A021058() {
    super(new PeriodicSequence(1, 8, 5), 0);
  }
}
