package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021536 Decimal expansion of 1/532.
 * @author Sean A. Irvine
 */
public class A021536 extends PrependSequence {

  /** Construct the sequence. */
  public A021536() {
    super(new PeriodicSequence(1, 8, 7, 9, 6, 9, 9, 2, 4, 8, 1, 2, 0, 3, 0, 0, 7, 5), 0, 0);
  }
}
