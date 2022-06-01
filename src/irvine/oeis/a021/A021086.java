package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021086 Decimal expansion of 1/82.
 * @author Sean A. Irvine
 */
public class A021086 extends PrependSequence {

  /** Construct the sequence. */
  public A021086() {
    super(new PeriodicSequence(1, 2, 1, 9, 5), 0);
  }
}
