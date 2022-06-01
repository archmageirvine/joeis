package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021270 Decimal expansion of 1/266.
 * @author Sean A. Irvine
 */
public class A021270 extends PrependSequence {

  /** Construct the sequence. */
  public A021270() {
    super(new PeriodicSequence(0, 3, 7, 5, 9, 3, 9, 8, 4, 9, 6, 2, 4, 0, 6, 0, 1, 5), 0);
  }
}
