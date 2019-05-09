package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021078 Decimal expansion of 1/74.
 * @author Sean A. Irvine
 */
public class A021078 extends PrependSequence {

  /** Construct the sequence. */
  public A021078() {
    super(new PeriodicSequence(1, 3, 5), 0);
  }
}
