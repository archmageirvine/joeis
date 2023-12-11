package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021152 Decimal expansion of 1/148.
 * @author Sean A. Irvine
 */
public class A021152 extends PrependSequence {

  /** Construct the sequence. */
  public A021152() {
    super(new PeriodicSequence(6, 7, 5), 0, 0);
  }
}
