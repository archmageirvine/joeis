package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021166 Decimal expansion of 1/162.
 * @author Sean A. Irvine
 */
public class A021166 extends PrependSequence {

  /** Construct the sequence. */
  public A021166() {
    super(new PeriodicSequence(0, 6, 1, 7, 2, 8, 3, 9, 5), 0);
  }
}
