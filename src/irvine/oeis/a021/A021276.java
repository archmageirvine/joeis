package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021276 Decimal expansion of 1/272.
 * @author Sean A. Irvine
 */
public class A021276 extends PrependSequence {

  /** Construct the sequence. */
  public A021276() {
    super(new PeriodicSequence(7, 6, 4, 7, 0, 5, 8, 8, 2, 3, 5, 2, 9, 4, 1, 1), 0, 0, 3, 6);
  }
}
