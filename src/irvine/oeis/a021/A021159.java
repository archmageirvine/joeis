package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021159 Decimal expansion of 1/155.
 * @author Sean A. Irvine
 */
public class A021159 extends PrependSequence {

  /** Construct the sequence. */
  public A021159() {
    super(new PeriodicSequence(0, 6, 4, 5, 1, 6, 1, 2, 9, 0, 3, 2, 2, 5, 8), 0);
  }
}
