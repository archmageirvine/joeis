package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021499 Decimal expansion of 1/495.
 * @author Sean A. Irvine
 */
public class A021499 extends PrependSequence {

  /** Construct the sequence. */
  public A021499() {
    super(new PeriodicSequence(0, 2), 0);
  }
}
