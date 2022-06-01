package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021428 Decimal expansion of 1/424.
 * @author Sean A. Irvine
 */
public class A021428 extends PrependSequence {

  /** Construct the sequence. */
  public A021428() {
    super(new PeriodicSequence(3, 5, 8, 4, 9, 0, 5, 6, 6, 0, 3, 7, 7), 0, 0, 2);
  }
}
