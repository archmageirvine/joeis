package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021642 Decimal expansion of 1/638.
 * @author Sean A. Irvine
 */
public class A021642 extends PrependSequence {

  /** Construct the sequence. */
  public A021642() {
    super(new PeriodicSequence(0, 1, 5, 6, 7, 3, 9, 8, 1, 1, 9, 1, 2, 2, 2, 5, 7, 0, 5, 3, 2, 9, 1, 5, 3, 6, 0, 5), 0);
  }
}

