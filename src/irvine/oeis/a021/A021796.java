package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021796 Decimal expansion of 1/792.
 * @author Sean A. Irvine
 */
public class A021796 extends PrependSequence {

  /** Construct the sequence. */
  public A021796() {
    super(new PeriodicSequence(2, 6), 0, 0, 1);
  }
}

