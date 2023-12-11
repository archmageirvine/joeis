package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021320 Decimal expansion of 1/316.
 * @author Sean A. Irvine
 */
public class A021320 extends PrependSequence {

  /** Construct the sequence. */
  public A021320() {
    super(new PeriodicSequence(3, 1, 6, 4, 5, 5, 6, 9, 6, 2, 0, 2, 5), 0, 0);
  }
}
