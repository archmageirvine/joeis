package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021828 Decimal expansion of 1/824.
 * @author Sean A. Irvine
 */
public class A021828 extends PrependSequence {

  /** Construct the sequence. */
  public A021828() {
    super(new PeriodicSequence(2, 1, 3, 5, 9, 2, 2, 3, 3, 0, 0, 9, 7, 0, 8, 7, 3, 7, 8, 6, 4, 0, 7, 7, 6, 6, 9, 9, 0, 2, 9, 1, 2, 6), 0, 0, 1);
  }
}

