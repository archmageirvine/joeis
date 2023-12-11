package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021886 Decimal expansion of 1/882.
 * @author Sean A. Irvine
 */
public class A021886 extends PrependSequence {

  /** Construct the sequence. */
  public A021886() {
    super(new PeriodicSequence(0, 1, 1, 3, 3, 7, 8, 6, 8, 4, 8, 0, 7, 2, 5, 6, 2, 3, 5, 8, 2, 7, 6, 6, 4, 3, 9, 9, 0, 9, 2, 9, 7, 0, 5, 2, 1, 5, 4, 1, 9, 5), 0);
  }
}

