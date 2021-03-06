package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021028 Decimal expansion of 1/24.
 * @author Sean A. Irvine
 */
public class A021028 extends PrependSequence {

  /** Construct the sequence. */
  public A021028() {
    super(new PeriodicSequence(6), 0, 4, 1);
  }
}
