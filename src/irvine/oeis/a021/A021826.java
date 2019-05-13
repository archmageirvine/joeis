package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021826 Decimal expansion of 1/822.
 * @author Sean A. Irvine
 */
public class A021826 extends PrependSequence {

  /** Construct the sequence. */
  public A021826() {
    super(new PeriodicSequence(0, 1, 2, 1, 6, 5, 4, 5), 0);
  }
}

