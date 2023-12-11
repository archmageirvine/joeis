package irvine.oeis.a020;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

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
