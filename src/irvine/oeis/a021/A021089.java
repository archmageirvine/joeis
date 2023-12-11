package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021089 Decimal expansion of 1/85.
 * @author Sean A. Irvine
 */
public class A021089 extends PrependSequence {

  /** Construct the sequence. */
  public A021089() {
    super(new PeriodicSequence(1, 1, 7, 6, 4, 7, 0, 5, 8, 8, 2, 3, 5, 2, 9, 4), 0);
  }
}
