package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021322 Decimal expansion of 1/318.
 * @author Sean A. Irvine
 */
public class A021322 extends PrependSequence {

  /** Construct the sequence. */
  public A021322() {
    super(new PeriodicSequence(0, 3, 1, 4, 4, 6, 5, 4, 0, 8, 8, 0, 5), 0);
  }
}
