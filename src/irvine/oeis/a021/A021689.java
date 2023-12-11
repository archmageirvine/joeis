package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021689 Decimal expansion of 1/685.
 * @author Sean A. Irvine
 */
public class A021689 extends PrependSequence {

  /** Construct the sequence. */
  public A021689() {
    super(new PeriodicSequence(0, 1, 4, 5, 9, 8, 5, 4), 0);
  }
}

