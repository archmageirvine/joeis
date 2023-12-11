package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021328 Decimal expansion of 1/324.
 * @author Sean A. Irvine
 */
public class A021328 extends PrependSequence {

  /** Construct the sequence. */
  public A021328() {
    super(new PeriodicSequence(3, 0, 8, 6, 4, 1, 9, 7, 5), 0, 0);
  }
}
