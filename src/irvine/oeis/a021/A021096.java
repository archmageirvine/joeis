package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021096 Decimal expansion of 1/92.
 * @author Sean A. Irvine
 */
public class A021096 extends PrependSequence {

  /** Construct the sequence. */
  public A021096() {
    super(new PeriodicSequence(0, 8, 6, 9, 5, 6, 5, 2, 1, 7, 3, 9, 1, 3, 0, 4, 3, 4, 7, 8, 2, 6), 0, 1);
  }
}
