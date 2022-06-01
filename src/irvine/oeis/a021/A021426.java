package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021426 Decimal expansion of 1/422.
 * @author Sean A. Irvine
 */
public class A021426 extends PrependSequence {

  /** Construct the sequence. */
  public A021426() {
    super(new PeriodicSequence(0, 2, 3, 6, 9, 6, 6, 8, 2, 4, 6, 4, 4, 5, 4, 9, 7, 6, 3, 0, 3, 3, 1, 7, 5, 3, 5, 5, 4, 5), 0);
  }
}
