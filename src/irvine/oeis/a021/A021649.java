package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021649 Decimal expansion of 1/645.
 * @author Sean A. Irvine
 */
public class A021649 extends PrependSequence {

  /** Construct the sequence. */
  public A021649() {
    super(new PeriodicSequence(0, 1, 5, 5, 0, 3, 8, 7, 5, 9, 6, 8, 9, 9, 2, 2, 4, 8, 0, 6, 2), 0);
  }
}

