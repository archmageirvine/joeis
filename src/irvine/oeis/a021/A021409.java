package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021409 Decimal expansion of 1/405.
 * @author Sean A. Irvine
 */
public class A021409 extends PrependSequence {

  /** Construct the sequence. */
  public A021409() {
    super(new PeriodicSequence(0, 2, 4, 6, 9, 1, 3, 5, 8), 0);
  }
}
