package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021430 Decimal expansion of 1/426.
 * @author Sean A. Irvine
 */
public class A021430 extends PrependSequence {

  /** Construct the sequence. */
  public A021430() {
    super(new PeriodicSequence(0, 2, 3, 4, 7, 4, 1, 7, 8, 4, 0, 3, 7, 5, 5, 8, 6, 8, 5, 4, 4, 6, 0, 0, 9, 3, 8, 9, 6, 7, 1, 3, 6, 1, 5), 0);
  }
}
