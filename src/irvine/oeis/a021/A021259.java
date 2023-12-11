package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021259 Decimal expansion of 1/255.
 * @author Sean A. Irvine
 */
public class A021259 extends PrependSequence {

  /** Construct the sequence. */
  public A021259() {
    super(new PeriodicSequence(0, 3, 9, 2, 1, 5, 6, 8, 6, 2, 7, 4, 5, 0, 9, 8), 0);
  }
}
