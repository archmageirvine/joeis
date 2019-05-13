package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021670 Decimal expansion of 1/666.
 * @author Sean A. Irvine
 */
public class A021670 extends PrependSequence {

  /** Construct the sequence. */
  public A021670() {
    super(new PeriodicSequence(0, 1, 5), 0);
  }
}

