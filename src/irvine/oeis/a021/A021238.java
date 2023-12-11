package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021238 Decimal expansion of 1/234.
 * @author Sean A. Irvine
 */
public class A021238 extends PrependSequence {

  /** Construct the sequence. */
  public A021238() {
    super(new PeriodicSequence(0, 4, 2, 7, 3, 5), 0);
  }
}
