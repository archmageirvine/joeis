package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021562 Decimal expansion of 1/558.
 * @author Sean A. Irvine
 */
public class A021562 extends PrependSequence {

  /** Construct the sequence. */
  public A021562() {
    super(new PeriodicSequence(0, 1, 7, 9, 2, 1, 1, 4, 6, 9, 5, 3, 4, 0, 5), 0);
  }
}
