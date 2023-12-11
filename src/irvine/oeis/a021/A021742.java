package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021742 Decimal expansion of 1/738.
 * @author Sean A. Irvine
 */
public class A021742 extends PrependSequence {

  /** Construct the sequence. */
  public A021742() {
    super(new PeriodicSequence(0, 1, 3, 5, 5), 0);
  }
}

