package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021068 Decimal expansion of 1/64.
 * @author Sean A. Irvine
 */
public class A021068 extends PrependSequence {

  /** Construct the sequence. */
  public A021068() {
    super(new PeriodicSequence(0), 0, 1, 5, 6, 2, 5);
  }
}
