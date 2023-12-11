package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021668 Decimal expansion of 1/664.
 * @author Sean A. Irvine
 */
public class A021668 extends PrependSequence {

  /** Construct the sequence. */
  public A021668() {
    super(new PeriodicSequence(5, 0, 6, 0, 2, 4, 0, 9, 6, 3, 8, 5, 5, 4, 2, 1, 6, 8, 6, 7, 4, 6, 9, 8, 7, 9, 5, 1, 8, 0, 7, 2, 2, 8, 9, 1, 5, 6, 6, 2, 6), 0, 0, 1);
  }
}

