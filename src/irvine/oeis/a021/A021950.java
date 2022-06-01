package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021950 Decimal expansion of 1/946.
 * @author Sean A. Irvine
 */
public class A021950 extends PrependSequence {

  /** Construct the sequence. */
  public A021950() {
    super(new PeriodicSequence(0, 1, 0, 5, 7, 0, 8, 2, 4, 5, 2, 4, 3, 1, 2, 8, 9, 6, 4, 0, 5, 9, 1, 9, 6, 6, 1, 7, 3, 3, 6, 1, 5, 2, 2, 1, 9, 8, 7, 3, 1, 5), 0);
  }
}

