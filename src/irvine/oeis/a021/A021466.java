package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021466 Decimal expansion of 1/462.
 * @author Sean A. Irvine
 */
public class A021466 extends PrependSequence {

  /** Construct the sequence. */
  public A021466() {
    super(new PeriodicSequence(0, 2, 1, 6, 4, 5), 0);
  }
}
