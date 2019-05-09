package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021082 Decimal expansion of 1/78.
 * @author Sean A. Irvine
 */
public class A021082 extends PrependSequence {

  /** Construct the sequence. */
  public A021082() {
    super(new PeriodicSequence(1, 2, 8, 2, 0, 5), 0);
  }
}
