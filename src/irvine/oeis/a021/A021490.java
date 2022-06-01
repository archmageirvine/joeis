package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021490 Decimal expansion of 1/486.
 * @author Sean A. Irvine
 */
public class A021490 extends PrependSequence {

  /** Construct the sequence. */
  public A021490() {
    super(new PeriodicSequence(0, 2, 0, 5, 7, 6, 1, 3, 1, 6, 8, 7, 2, 4, 2, 7, 9, 8, 3, 5, 3, 9, 0, 9, 4, 6, 5), 0);
  }
}
