package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021708 Decimal expansion of 1/704.
 * @author Sean A. Irvine
 */
public class A021708 extends PrependSequence {

  /** Construct the sequence. */
  public A021708() {
    super(new PeriodicSequence(4, 5), 0, 0, 1, 4, 2, 0);
  }
}

