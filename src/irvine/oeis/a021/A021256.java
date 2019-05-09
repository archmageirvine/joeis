package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021256 Decimal expansion of 1/252.
 * @author Sean A. Irvine
 */
public class A021256 extends PrependSequence {

  /** Construct the sequence. */
  public A021256() {
    super(new PeriodicSequence(3, 9, 6, 8, 2, 5), 0, 0);
  }
}
