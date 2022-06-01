package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021946 Decimal expansion of 1/942.
 * @author Sean A. Irvine
 */
public class A021946 extends PrependSequence {

  /** Construct the sequence. */
  public A021946() {
    super(new PeriodicSequence(0, 1, 0, 6, 1, 5, 7, 1, 1, 2, 5, 2, 6, 5, 3, 9, 2, 7, 8, 1, 3, 1, 6, 3, 4, 8, 1, 9, 5, 3, 2, 9, 0, 8, 7, 0, 4, 8, 8, 3, 2, 2, 7, 1, 7, 6, 2, 2, 0, 8, 0, 6, 7, 9, 4, 0, 5, 5, 2, 0, 1, 6, 9, 8, 5, 1, 3, 8, 0, 0, 4, 2, 4, 6, 2, 8, 4, 5), 0);
  }
}

