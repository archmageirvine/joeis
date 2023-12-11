package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021420 Decimal expansion of 1/416.
 * @author Sean A. Irvine
 */
public class A021420 extends PrependSequence {

  /** Construct the sequence. */
  public A021420() {
    super(new PeriodicSequence(3, 8, 4, 6, 1, 5, 3, 8, 4, 6, 1, 5, 3, 8, 4, 6, 1, 5), 0, 0, 2, 4, 0);
  }
}
