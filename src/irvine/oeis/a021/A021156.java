package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021156 Decimal expansion of 1/152.
 * @author Sean A. Irvine
 */
public class A021156 extends PrependSequence {

  /** Construct the sequence. */
  public A021156() {
    super(new PeriodicSequence(5, 7, 8, 9, 4, 7, 3, 6, 8, 4, 2, 1, 0, 5, 2, 6, 3, 1), 0, 0, 6);
  }
}
