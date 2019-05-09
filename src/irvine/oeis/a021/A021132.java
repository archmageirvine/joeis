package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021132 Decimal expansion of 1/128.
 * @author Sean A. Irvine
 */
public class A021132 extends PrependSequence {

  /** Construct the sequence. */
  public A021132() {
    super(new PeriodicSequence(0), 0, 0, 7, 8, 1, 2, 5);
  }
}
