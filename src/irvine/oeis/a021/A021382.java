package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021382 Decimal expansion of 1/378.
 * @author Sean A. Irvine
 */
public class A021382 extends PrependSequence {

  /** Construct the sequence. */
  public A021382() {
    super(new PeriodicSequence(0, 2, 6, 4, 5, 5), 0);
  }
}
