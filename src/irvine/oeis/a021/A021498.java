package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021498 Decimal expansion of 1/494.
 * @author Sean A. Irvine
 */
public class A021498 extends PrependSequence {

  /** Construct the sequence. */
  public A021498() {
    super(new PeriodicSequence(0, 2, 0, 2, 4, 2, 9, 1, 4, 9, 7, 9, 7, 5, 7, 0, 8, 5), 0);
  }
}
