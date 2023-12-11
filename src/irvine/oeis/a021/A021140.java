package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021140 Decimal expansion of 1/136.
 * @author Sean A. Irvine
 */
public class A021140 extends PrependSequence {

  /** Construct the sequence. */
  public A021140() {
    super(new PeriodicSequence(3, 5, 2, 9, 4, 1, 1, 7, 6, 4, 7, 0, 5, 8, 8, 2), 0, 0, 7);
  }
}
