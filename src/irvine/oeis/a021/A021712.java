package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021712 Decimal expansion of 1/708.
 * @author Sean A. Irvine
 */
public class A021712 extends PrependSequence {

  /** Construct the sequence. */
  public A021712() {
    super(new PeriodicSequence(1, 4, 1, 2, 4, 2, 9, 3, 7, 8, 5, 3, 1, 0, 7, 3, 4, 4, 6, 3, 2, 7, 6, 8, 3, 6, 1, 5, 8, 1, 9, 2, 0, 9, 0, 3, 9, 5, 4, 8, 0, 2, 2, 5, 9, 8, 8, 7, 0, 0, 5, 6, 4, 9, 7, 1, 7, 5), 0, 0);
  }
}

