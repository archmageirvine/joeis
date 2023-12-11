package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021272 Decimal expansion of 1/268.
 * @author Sean A. Irvine
 */
public class A021272 extends PrependSequence {

  /** Construct the sequence. */
  public A021272() {
    super(new PeriodicSequence(3, 7, 3, 1, 3, 4, 3, 2, 8, 3, 5, 8, 2, 0, 8, 9, 5, 5, 2, 2, 3, 8, 8, 0, 5, 9, 7, 0, 1, 4, 9, 2, 5), 0, 0);
  }
}
