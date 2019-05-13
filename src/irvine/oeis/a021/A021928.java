package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021928 Decimal expansion of 1/924.
 * @author Sean A. Irvine
 */
public class A021928 extends PrependSequence {

  /** Construct the sequence. */
  public A021928() {
    super(new PeriodicSequence(1, 0, 8, 2, 2, 5), 0, 0);
  }
}

