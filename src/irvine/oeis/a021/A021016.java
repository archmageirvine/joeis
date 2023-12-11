package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021016 Decimal expansion of 1/12.
 * @author Sean A. Irvine
 */
public class A021016 extends PrependSequence {

  /** Construct the sequence. */
  public A021016() {
    super(new PeriodicSequence(3), 0, 8);
  }
}
