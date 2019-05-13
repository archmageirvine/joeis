package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021732 Decimal expansion of 1/728.
 * @author Sean A. Irvine
 */
public class A021732 extends PrependSequence {

  /** Construct the sequence. */
  public A021732() {
    super(new PeriodicSequence(3, 7, 3, 6, 2, 6), 0, 0, 1);
  }
}

