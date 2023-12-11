package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021378 Decimal expansion of 1/374.
 * @author Sean A. Irvine
 */
public class A021378 extends PrependSequence {

  /** Construct the sequence. */
  public A021378() {
    super(new PeriodicSequence(0, 2, 6, 7, 3, 7, 9, 6, 7, 9, 1, 4, 4, 3, 8, 5), 0);
  }
}
