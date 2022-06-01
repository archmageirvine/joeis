package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021032 Decimal expansion of 1/28.
 * @author Sean A. Irvine
 */
public class A021032 extends PrependSequence {

  /** Construct the sequence. */
  public A021032() {
    super(new PeriodicSequence(5, 7, 1, 4, 2, 8), 0, 3);
  }
}
