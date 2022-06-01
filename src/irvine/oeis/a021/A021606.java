package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021606 Decimal expansion of 1/602.
 * @author Sean A. Irvine
 */
public class A021606 extends PrependSequence {

  /** Construct the sequence. */
  public A021606() {
    super(new PeriodicSequence(0, 1, 6, 6, 1, 1, 2, 9, 5, 6, 8, 1, 0, 6, 3, 1, 2, 2, 9, 2, 3, 5, 8, 8, 0, 3, 9, 8, 6, 7, 1, 0, 9, 6, 3, 4, 5, 5, 1, 4, 9, 5), 0);
  }
}

