package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021679 Decimal expansion of 1/675.
 * @author Sean A. Irvine
 */
public class A021679 extends PrependSequence {

  /** Construct the sequence. */
  public A021679() {
    super(new PeriodicSequence(1, 4, 8), 0, 0);
  }
}

