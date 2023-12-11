package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021190 Decimal expansion of 1/186.
 * @author Sean A. Irvine
 */
public class A021190 extends PrependSequence {

  /** Construct the sequence. */
  public A021190() {
    super(new PeriodicSequence(0, 5, 3, 7, 6, 3, 4, 4, 0, 8, 6, 0, 2, 1, 5), 0);
  }
}
