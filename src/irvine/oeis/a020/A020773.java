package irvine.oeis.a020;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A020773 Decimal expansion of 1/4.
 * @author Sean A. Irvine
 */
public class A020773 extends PrependSequence {

  /** Construct the sequence. */
  public A020773() {
    super(new PeriodicSequence(0), 2, 5);
  }
}
