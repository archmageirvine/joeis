package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021312 Decimal expansion of 1/308.
 * @author Sean A. Irvine
 */
public class A021312 extends PrependSequence {

  /** Construct the sequence. */
  public A021312() {
    super(new PeriodicSequence(3, 2, 4, 6, 7, 5), 0, 0);
  }
}
