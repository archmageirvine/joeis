package irvine.oeis.a020;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A020821 Decimal expansion of 1/8.
 * @author Sean A. Irvine
 */
public class A020821 extends PrependSequence {

  /** Construct the sequence. */
  public A020821() {
    super(new PeriodicSequence(0), 1, 2, 5);
  }
}
