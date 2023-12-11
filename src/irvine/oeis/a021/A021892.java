package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021892 Decimal expansion of 1/888.
 * @author Sean A. Irvine
 */
public class A021892 extends PrependSequence {

  /** Construct the sequence. */
  public A021892() {
    super(new PeriodicSequence(1, 2, 6), 0, 0, 1);
  }
}

