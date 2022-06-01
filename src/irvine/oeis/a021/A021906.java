package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021906 Decimal expansion of 1/902.
 * @author Sean A. Irvine
 */
public class A021906 extends PrependSequence {

  /** Construct the sequence. */
  public A021906() {
    super(new PeriodicSequence(0, 1, 1, 0, 8, 6, 4, 7, 4, 5), 0);
  }
}

