package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021059 Decimal expansion of 1/55.
 * @author Sean A. Irvine
 */
public class A021059 extends PrependSequence {

  /** Construct the sequence. */
  public A021059() {
    super(new PeriodicSequence(1, 8), 0);
  }
}
