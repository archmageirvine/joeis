package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021419 Decimal expansion of 1/415.
 * @author Sean A. Irvine
 */
public class A021419 extends PrependSequence {

  /** Construct the sequence. */
  public A021419() {
    super(new PeriodicSequence(0, 2, 4, 0, 9, 6, 3, 8, 5, 5, 4, 2, 1, 6, 8, 6, 7, 4, 6, 9, 8, 7, 9, 5, 1, 8, 0, 7, 2, 2, 8, 9, 1, 5, 6, 6, 2, 6, 5, 0, 6), 0);
  }
}
