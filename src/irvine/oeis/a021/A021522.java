package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021522 Decimal expansion of 1/518.
 * @author Sean A. Irvine
 */
public class A021522 extends PrependSequence {

  /** Construct the sequence. */
  public A021522() {
    super(new PeriodicSequence(0, 1, 9, 3, 0, 5), 0);
  }
}
