package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021176 Decimal expansion of 1/172.
 * @author Sean A. Irvine
 */
public class A021176 extends PrependSequence {

  /** Construct the sequence. */
  public A021176() {
    super(new PeriodicSequence(5, 8, 1, 3, 9, 5, 3, 4, 8, 8, 3, 7, 2, 0, 9, 3, 0, 2, 3, 2, 5), 0, 0);
  }
}
