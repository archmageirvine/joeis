package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021220 Decimal expansion of 1/216.
 * @author Sean A. Irvine
 */
public class A021220 extends PrependSequence {

  /** Construct the sequence. */
  public A021220() {
    super(new PeriodicSequence(6, 2, 9), 0, 0, 4);
  }
}
