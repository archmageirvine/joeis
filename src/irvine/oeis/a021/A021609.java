package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021609 Decimal expansion of 1/605.
 * @author Sean A. Irvine
 */
public class A021609 extends PrependSequence {

  /** Construct the sequence. */
  public A021609() {
    super(new PeriodicSequence(0, 1, 6, 5, 2, 8, 9, 2, 5, 6, 1, 9, 8, 3, 4, 7, 1, 0, 7, 4, 3, 8), 0);
  }
}

