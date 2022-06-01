package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021692 Decimal expansion of 1/688.
 * @author Sean A. Irvine
 */
public class A021692 extends PrependSequence {

  /** Construct the sequence. */
  public A021692() {
    super(new PeriodicSequence(5, 3, 4, 8, 8, 3, 7, 2, 0, 9, 3, 0, 2, 3, 2, 5, 5, 8, 1, 3, 9), 0, 0, 1, 4);
  }
}

