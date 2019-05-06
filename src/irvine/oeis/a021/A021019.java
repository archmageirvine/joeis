package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021019 Decimal expansion of 1/15.
 * @author Sean A. Irvine
 */
public class A021019 extends PrependSequence {

  /** Construct the sequence. */
  public A021019() {
    super(new PeriodicSequence(6), 0);
  }
}
