package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021406 Decimal expansion of 1/402.
 * @author Sean A. Irvine
 */
public class A021406 extends PrependSequence {

  /** Construct the sequence. */
  public A021406() {
    super(new PeriodicSequence(0, 2, 4, 8, 7, 5, 6, 2, 1, 8, 9, 0, 5, 4, 7, 2, 6, 3, 6, 8, 1, 5, 9, 2, 0, 3, 9, 8, 0, 0, 9, 9, 5), 0);
  }
}
