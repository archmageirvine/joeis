package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021160 Decimal expansion of 1/156.
 * @author Sean A. Irvine
 */
public class A021160 extends PrependSequence {

  /** Construct the sequence. */
  public A021160() {
    super(new PeriodicSequence(6, 4, 1, 0, 2, 5), 0, 0);
  }
}
