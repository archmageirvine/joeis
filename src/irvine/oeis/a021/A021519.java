package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021519 Decimal expansion of 1/515.
 * @author Sean A. Irvine
 */
public class A021519 extends PrependSequence {

  /** Construct the sequence. */
  public A021519() {
    super(new PeriodicSequence(0, 1, 9, 4, 1, 7, 4, 7, 5, 7, 2, 8, 1, 5, 5, 3, 3, 9, 8, 0, 5, 8, 2, 5, 2, 4, 2, 7, 1, 8, 4, 4, 6, 6), 0);
  }
}
