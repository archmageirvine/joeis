package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021739 Decimal expansion of 1/735.
 * @author Sean A. Irvine
 */
public class A021739 extends PrependSequence {

  /** Construct the sequence. */
  public A021739() {
    super(new PeriodicSequence(0, 1, 3, 6, 0, 5, 4, 4, 2, 1, 7, 6, 8, 7, 0, 7, 4, 8, 2, 9, 9, 3, 1, 9, 7, 2, 7, 8, 9, 1, 1, 5, 6, 4, 6, 2, 5, 8, 5, 0, 3, 4), 0);
  }
}

