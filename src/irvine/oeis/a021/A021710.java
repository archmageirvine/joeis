package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021710 Decimal expansion of 1/706.
 * @author Sean A. Irvine
 */
public class A021710 extends PrependSequence {

  /** Construct the sequence. */
  public A021710() {
    super(new PeriodicSequence(0, 1, 4, 1, 6, 4, 3, 0, 5, 9, 4, 9, 0, 0, 8, 4, 9, 8, 5, 8, 3, 5, 6, 9, 4, 0, 5, 0, 9, 9, 1, 5), 0);
  }
}

