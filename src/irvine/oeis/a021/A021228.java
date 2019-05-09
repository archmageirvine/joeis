package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021228 Decimal expansion of 1/224.
 * @author Sean A. Irvine
 */
public class A021228 extends PrependSequence {

  /** Construct the sequence. */
  public A021228() {
    super(new PeriodicSequence(4, 2, 8, 5, 7, 1), 0, 0, 4, 4, 6);
  }
}
