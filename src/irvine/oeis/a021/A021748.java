package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021748 Decimal expansion of 1/744.
 * @author Sean A. Irvine
 */
public class A021748 extends PrependSequence {

  /** Construct the sequence. */
  public A021748() {
    super(new PeriodicSequence(3, 4, 4, 0, 8, 6, 0, 2, 1, 5, 0, 5, 3, 7, 6), 0, 0, 1);
  }
}

