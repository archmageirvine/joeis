package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021148 Decimal expansion of 1/144.
 * @author Sean A. Irvine
 */
public class A021148 extends PrependSequence {

  /** Construct the sequence. */
  public A021148() {
    super(new PeriodicSequence(4), 0, 0, 6, 9);
  }
}
