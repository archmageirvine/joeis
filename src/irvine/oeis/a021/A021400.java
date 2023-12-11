package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021400 Decimal expansion of 1/396.
 * @author Sean A. Irvine
 */
public class A021400 extends PrependSequence {

  /** Construct the sequence. */
  public A021400() {
    super(new PeriodicSequence(2, 5), 0, 0);
  }
}
