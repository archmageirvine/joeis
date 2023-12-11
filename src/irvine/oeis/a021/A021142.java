package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021142 Decimal expansion of 1/138.
 * @author Sean A. Irvine
 */
public class A021142 extends PrependSequence {

  /** Construct the sequence. */
  public A021142() {
    super(new PeriodicSequence(0, 7, 2, 4, 6, 3, 7, 6, 8, 1, 1, 5, 9, 4, 2, 0, 2, 8, 9, 8, 5, 5), 0);
  }
}
