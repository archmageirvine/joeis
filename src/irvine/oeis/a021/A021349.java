package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021349 Decimal expansion of 1/345.
 * @author Sean A. Irvine
 */
public class A021349 extends PrependSequence {

  /** Construct the sequence. */
  public A021349() {
    super(new PeriodicSequence(0, 2, 8, 9, 8, 5, 5, 0, 7, 2, 4, 6, 3, 7, 6, 8, 1, 1, 5, 9, 4, 2), 0);
  }
}
