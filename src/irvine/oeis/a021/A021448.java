package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021448 Decimal expansion of 1/444.
 * @author Sean A. Irvine
 */
public class A021448 extends PrependSequence {

  /** Construct the sequence. */
  public A021448() {
    super(new PeriodicSequence(2, 2, 5), 0, 0);
  }
}
