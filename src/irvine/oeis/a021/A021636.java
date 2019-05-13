package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021636 Decimal expansion of 1/632.
 * @author Sean A. Irvine
 */
public class A021636 extends PrependSequence {

  /** Construct the sequence. */
  public A021636() {
    super(new PeriodicSequence(5, 8, 2, 2, 7, 8, 4, 8, 1, 0, 1, 2, 6), 0, 0, 1);
  }
}

