package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021546 Decimal expansion of 1/542.
 * @author Sean A. Irvine
 */
public class A021546 extends PrependSequence {

  /** Construct the sequence. */
  public A021546() {
    super(new PeriodicSequence(0, 1, 8, 4, 5), 0);
  }
}
