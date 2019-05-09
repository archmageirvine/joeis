package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021118 Decimal expansion of 1/114.
 * @author Sean A. Irvine
 */
public class A021118 extends PrependSequence {

  /** Construct the sequence. */
  public A021118() {
    super(new PeriodicSequence(0, 8, 7, 7, 1, 9, 2, 9, 8, 2, 4, 5, 6, 1, 4, 0, 3, 5), 0);
  }
}
