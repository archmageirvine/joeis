package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021436 Decimal expansion of 1/432.
 * @author Sean A. Irvine
 */
public class A021436 extends PrependSequence {

  /** Construct the sequence. */
  public A021436() {
    super(new PeriodicSequence(1, 4, 8), 0, 0, 2, 3);
  }
}
