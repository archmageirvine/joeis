package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021836 Decimal expansion of 1/832.
 * @author Sean A. Irvine
 */
public class A021836 extends PrependSequence {

  /** Construct the sequence. */
  public A021836() {
    super(new PeriodicSequence(9, 2, 3, 0, 7, 6), 0, 0, 1, 2, 0, 1);
  }
}

