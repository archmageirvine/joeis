package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021929 Decimal expansion of 1/925.
 * @author Sean A. Irvine
 */
public class A021929 extends PrependSequence {

  /** Construct the sequence. */
  public A021929() {
    super(new PeriodicSequence(1, 0, 8), 0, 0);
  }
}

