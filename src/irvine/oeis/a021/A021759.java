package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021759 Decimal expansion of 1/755.
 * @author Sean A. Irvine
 */
public class A021759 extends PrependSequence {

  /** Construct the sequence. */
  public A021759() {
    super(new PeriodicSequence(0, 1, 3, 2, 4, 5, 0, 3, 3, 1, 1, 2, 5, 8, 2, 7, 8, 1, 4, 5, 6, 9, 5, 3, 6, 4, 2, 3, 8, 4, 1, 0, 5, 9, 6, 0, 2, 6, 4, 9, 0, 0, 6, 6, 2, 2, 5, 1, 6, 5, 5, 6, 2, 9, 1, 3, 9, 0, 7, 2, 8, 4, 7, 6, 8, 2, 1, 1, 9, 2, 0, 5, 2, 9, 8), 0);
  }
}

