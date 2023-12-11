package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021526 Decimal expansion of 1/522.
 * @author Sean A. Irvine
 */
public class A021526 extends PrependSequence {

  /** Construct the sequence. */
  public A021526() {
    super(new PeriodicSequence(0, 1, 9, 1, 5, 7, 0, 8, 8, 1, 2, 2, 6, 0, 5, 3, 6, 3, 9, 8, 4, 6, 7, 4, 3, 2, 9, 5), 0);
  }
}
