package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021460 Decimal expansion of 1/456.
 * @author Sean A. Irvine
 */
public class A021460 extends PrependSequence {

  /** Construct the sequence. */
  public A021460() {
    super(new PeriodicSequence(1, 9, 2, 9, 8, 2, 4, 5, 6, 1, 4, 0, 3, 5, 0, 8, 7, 7), 0, 0, 2);
  }
}
