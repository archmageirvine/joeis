package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021249 Decimal expansion of 1/245.
 * @author Sean A. Irvine
 */
public class A021249 extends PrependSequence {

  /** Construct the sequence. */
  public A021249() {
    super(new PeriodicSequence(0, 4, 0, 8, 1, 6, 3, 2, 6, 5, 3, 0, 6, 1, 2, 2, 4, 4, 8, 9, 7, 9, 5, 9, 1, 8, 3, 6, 7, 3, 4, 6, 9, 3, 8, 7, 7, 5, 5, 1, 0, 2), 0);
  }
}
