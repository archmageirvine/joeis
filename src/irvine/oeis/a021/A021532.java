package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021532 Decimal expansion of 1/528.
 * @author Sean A. Irvine
 */
public class A021532 extends PrependSequence {

  /** Construct the sequence. */
  public A021532() {
    super(new PeriodicSequence(9, 3), 0, 0, 1, 8);
  }
}
