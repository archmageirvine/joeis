package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021452 Decimal expansion of 1/448.
 * @author Sean A. Irvine
 */
public class A021452 extends PrependSequence {

  /** Construct the sequence. */
  public A021452() {
    super(new PeriodicSequence(1, 4, 2, 8, 5, 7), 0, 0, 2, 2, 3, 2);
  }
}
