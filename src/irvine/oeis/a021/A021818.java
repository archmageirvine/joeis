package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021818 Decimal expansion of 1/814.
 * @author Sean A. Irvine
 */
public class A021818 extends PrependSequence {

  /** Construct the sequence. */
  public A021818() {
    super(new PeriodicSequence(0, 1, 2, 2, 8, 5), 0);
  }
}

