package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021090 Decimal expansion of 1/86.
 * @author Sean A. Irvine
 */
public class A021090 extends PrependSequence {

  /** Construct the sequence. */
  public A021090() {
    super(new PeriodicSequence(1, 1, 6, 2, 7, 9, 0, 6, 9, 7, 6, 7, 4, 4, 1, 8, 6, 0, 4, 6, 5), 0);
  }
}
