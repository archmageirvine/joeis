package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021236 Decimal expansion of 1/232.
 * @author Sean A. Irvine
 */
public class A021236 extends PrependSequence {

  /** Construct the sequence. */
  public A021236() {
    super(new PeriodicSequence(3, 1, 0, 3, 4, 4, 8, 2, 7, 5, 8, 6, 2, 0, 6, 8, 9, 6, 5, 5, 1, 7, 2, 4, 1, 3, 7, 9), 0, 0, 4);
  }
}
