package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021108 Decimal expansion of 1/104.
 * @author Sean A. Irvine
 */
public class A021108 extends PrependSequence {

  /** Construct the sequence. */
  public A021108() {
    super(new PeriodicSequence(6, 1, 5, 3, 8, 4), 0, 0, 9);
  }
}
