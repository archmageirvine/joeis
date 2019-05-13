package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021529 Decimal expansion of 1/525.
 * @author Sean A. Irvine
 */
public class A021529 extends PrependSequence {

  /** Construct the sequence. */
  public A021529() {
    super(new PeriodicSequence(1, 9, 0, 4, 7, 6), 0, 0);
  }
}
