package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021242 Decimal expansion of 1/238.
 * @author Sean A. Irvine
 */
public class A021242 extends PrependSequence {

  /** Construct the sequence. */
  public A021242() {
    super(new PeriodicSequence(0, 4, 2, 0, 1, 6, 8, 0, 6, 7, 2, 2, 6, 8, 9, 0, 7, 5, 6, 3, 0, 2, 5, 2, 1, 0, 0, 8, 4, 0, 3, 3, 6, 1, 3, 4, 4, 5, 3, 7, 8, 1, 5, 1, 2, 6, 0, 5), 0);
  }
}
