package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021619 Decimal expansion of 1/615.
 * @author Sean A. Irvine
 */
public class A021619 extends PrependSequence {

  /** Construct the sequence. */
  public A021619() {
    super(new PeriodicSequence(0, 1, 6, 2, 6), 0);
  }
}

