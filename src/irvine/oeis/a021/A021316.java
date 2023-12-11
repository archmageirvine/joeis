package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021316 Decimal expansion of 1/312.
 * @author Sean A. Irvine
 */
public class A021316 extends PrependSequence {

  /** Construct the sequence. */
  public A021316() {
    super(new PeriodicSequence(2, 0, 5, 1, 2, 8), 0, 0, 3);
  }
}
