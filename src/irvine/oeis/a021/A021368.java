package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021368 Decimal expansion of 1/364.
 * @author Sean A. Irvine
 */
public class A021368 extends PrependSequence {

  /** Construct the sequence. */
  public A021368() {
    super(new PeriodicSequence(2, 7, 4, 7, 2, 5), 0, 0);
  }
}
