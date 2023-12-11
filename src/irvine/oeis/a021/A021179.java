package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021179 Decimal expansion of 1/175.
 * @author Sean A. Irvine
 */
public class A021179 extends PrependSequence {

  /** Construct the sequence. */
  public A021179() {
    super(new PeriodicSequence(5, 7, 1, 4, 2, 8), 0, 0);
  }
}
