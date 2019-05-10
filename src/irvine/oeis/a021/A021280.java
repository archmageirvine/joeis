package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021280 Decimal expansion of 1/276.
 * @author Sean A. Irvine
 */
public class A021280 extends PrependSequence {

  /** Construct the sequence. */
  public A021280() {
    super(new PeriodicSequence(3, 6, 2, 3, 1, 8, 8, 4, 0, 5, 7, 9, 7, 1, 0, 1, 4, 4, 9, 2, 7, 5), 0, 0);
  }
}
