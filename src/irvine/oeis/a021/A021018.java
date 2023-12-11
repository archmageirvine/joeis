package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021018 Decimal expansion of 1/14.
 * @author Sean A. Irvine
 */
public class A021018 extends PrependSequence {

  /** Construct the sequence. */
  public A021018() {
    super(new PeriodicSequence(7, 1, 4, 2, 8, 5), 0);
  }
}
