package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

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
