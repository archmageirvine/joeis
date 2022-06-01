package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021576 Decimal expansion of 1/572.
 * @author Sean A. Irvine
 */
public class A021576 extends PrependSequence {

  /** Construct the sequence. */
  public A021576() {
    super(new PeriodicSequence(1, 7, 4, 8, 2, 5), 0, 0);
  }
}
