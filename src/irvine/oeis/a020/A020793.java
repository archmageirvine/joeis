package irvine.oeis.a020;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A020793 Decimal expansion of 1/6.
 * @author Sean A. Irvine
 */
public class A020793 extends PrependSequence {

  /** Construct the sequence. */
  public A020793() {
    super(new PeriodicSequence(6), 1);
  }
}
