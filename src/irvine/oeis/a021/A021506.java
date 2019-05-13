package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021506 Decimal expansion of 1/502.
 * @author Sean A. Irvine
 */
public class A021506 extends PrependSequence {

  /** Construct the sequence. */
  public A021506() {
    super(new PeriodicSequence(0, 1, 9, 9, 2, 0, 3, 1, 8, 7, 2, 5, 0, 9, 9, 6, 0, 1, 5, 9, 3, 6, 2, 5, 4, 9, 8, 0, 0, 7, 9, 6, 8, 1, 2, 7, 4, 9, 0, 0, 3, 9, 8, 4, 0, 6, 3, 7, 4, 5), 0);
  }
}
