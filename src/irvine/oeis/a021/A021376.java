package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021376 Decimal expansion of 1/372.
 * @author Sean A. Irvine
 */
public class A021376 extends PrependSequence {

  /** Construct the sequence. */
  public A021376() {
    super(new PeriodicSequence(2, 6, 8, 8, 1, 7, 2, 0, 4, 3, 0, 1, 0, 7, 5), 0, 0);
  }
}
