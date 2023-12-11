package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021960 Decimal expansion of 1/956.
 * @author Sean A. Irvine
 */
public class A021960 extends PrependSequence {

  /** Construct the sequence. */
  public A021960() {
    super(new PeriodicSequence(1, 0, 4, 6, 0, 2, 5), 0, 0);
  }
}

