package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021308 Decimal expansion of 1/304.
 * @author Sean A. Irvine
 */
public class A021308 extends PrependSequence {

  /** Construct the sequence. */
  public A021308() {
    super(new PeriodicSequence(8, 9, 4, 7, 3, 6, 8, 4, 2, 1, 0, 5, 2, 6, 3, 1, 5, 7), 0, 0, 3, 2);
  }
}
