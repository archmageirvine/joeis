package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021136 Decimal expansion of 1/132.
 * @author Sean A. Irvine
 */
public class A021136 extends PrependSequence {

  /** Construct the sequence. */
  public A021136() {
    super(new PeriodicSequence(7, 5), 0, 0);
  }
}
