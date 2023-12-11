package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021319 Decimal expansion of 1/315.
 * @author Sean A. Irvine
 */
public class A021319 extends PrependSequence {

  /** Construct the sequence. */
  public A021319() {
    super(new PeriodicSequence(0, 3, 1, 7, 4, 6), 0);
  }
}
