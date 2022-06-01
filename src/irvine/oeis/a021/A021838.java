package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021838 Decimal expansion of 1/834.
 * @author Sean A. Irvine
 */
public class A021838 extends PrependSequence {

  /** Construct the sequence. */
  public A021838() {
    super(new PeriodicSequence(0, 1, 1, 9, 9, 0, 4, 0, 7, 6, 7, 3, 8, 6, 0, 9, 1, 1, 2, 7, 0, 9, 8, 3, 2, 1, 3, 4, 2, 9, 2, 5, 6, 5, 9, 4, 7, 2, 4, 2, 2, 0, 6, 2, 3, 5), 0);
  }
}

