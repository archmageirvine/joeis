package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021250 Decimal expansion of 1/246.
 * @author Sean A. Irvine
 */
public class A021250 extends PrependSequence {

  /** Construct the sequence. */
  public A021250() {
    super(new PeriodicSequence(0, 4, 0, 6, 5), 0);
  }
}
