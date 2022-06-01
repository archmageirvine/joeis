package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021510 Decimal expansion of 1/506.
 * @author Sean A. Irvine
 */
public class A021510 extends PrependSequence {

  /** Construct the sequence. */
  public A021510() {
    super(new PeriodicSequence(0, 1, 9, 7, 6, 2, 8, 4, 5, 8, 4, 9, 8, 0, 2, 3, 7, 1, 5, 4, 1, 5), 0);
  }
}
