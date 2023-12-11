package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021208 Decimal expansion of 1/204.
 * @author Sean A. Irvine
 */
public class A021208 extends PrependSequence {

  /** Construct the sequence. */
  public A021208() {
    super(new PeriodicSequence(4, 9, 0, 1, 9, 6, 0, 7, 8, 4, 3, 1, 3, 7, 2, 5), 0, 0);
  }
}
