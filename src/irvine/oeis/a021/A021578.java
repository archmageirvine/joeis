package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021578 Decimal expansion of 1/574.
 * @author Sean A. Irvine
 */
public class A021578 extends PrependSequence {

  /** Construct the sequence. */
  public A021578() {
    super(new PeriodicSequence(0, 1, 7, 4, 2, 1, 6, 0, 2, 7, 8, 7, 4, 5, 6, 4, 4, 5, 9, 9, 3, 0, 3, 1, 3, 5, 8, 8, 8, 5), 0);
  }
}
