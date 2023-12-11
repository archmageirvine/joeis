package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021290 Decimal expansion of 1/286.
 * @author Sean A. Irvine
 */
public class A021290 extends PrependSequence {

  /** Construct the sequence. */
  public A021290() {
    super(new PeriodicSequence(0, 3, 4, 9, 6, 5), 0);
  }
}
