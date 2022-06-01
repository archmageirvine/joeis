package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021069 Decimal expansion of 1/65.
 * @author Sean A. Irvine
 */
public class A021069 extends PrependSequence {

  /** Construct the sequence. */
  public A021069() {
    super(new PeriodicSequence(1, 5, 3, 8, 4, 6), 0);
  }
}
