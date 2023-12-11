package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021640 Decimal expansion of 1/636.
 * @author Sean A. Irvine
 */
public class A021640 extends PrependSequence {

  /** Construct the sequence. */
  public A021640() {
    super(new PeriodicSequence(1, 5, 7, 2, 3, 2, 7, 0, 4, 4, 0, 2, 5), 0, 0);
  }
}

