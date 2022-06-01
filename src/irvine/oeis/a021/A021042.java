package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021042 Decimal expansion of 1/38.
 * @author Sean A. Irvine
 */
public class A021042 extends PrependSequence {

  /** Construct the sequence. */
  public A021042() {
    super(new PeriodicSequence(2, 6, 3, 1, 5, 7, 8, 9, 4, 7, 3, 6, 8, 4, 2, 1, 0, 5), 0);
  }
}
