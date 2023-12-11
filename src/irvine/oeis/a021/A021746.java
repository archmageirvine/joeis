package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021746 Decimal expansion of 1/742.
 * @author Sean A. Irvine
 */
public class A021746 extends PrependSequence {

  /** Construct the sequence. */
  public A021746() {
    super(new PeriodicSequence(0, 1, 3, 4, 7, 7, 0, 8, 8, 9, 4, 8, 7, 8, 7, 0, 6, 1, 9, 9, 4, 6, 0, 9, 1, 6, 4, 4, 2, 0, 4, 8, 5, 1, 7, 5, 2, 0, 2, 1, 5, 6, 3, 3, 4, 2, 3, 1, 8, 0, 5, 9, 2, 9, 9, 1, 9, 1, 3, 7, 4, 6, 6, 3, 0, 7, 2, 7, 7, 6, 2, 8, 0, 3, 2, 3, 4, 5), 0);
  }
}

