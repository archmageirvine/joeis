package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021252 Decimal expansion of 1/248.
 * @author Sean A. Irvine
 */
public class A021252 extends PrependSequence {

  /** Construct the sequence. */
  public A021252() {
    super(new PeriodicSequence(0, 3, 2, 2, 5, 8, 0, 6, 4, 5, 1, 6, 1, 2, 9), 0, 0, 4);
  }
}
