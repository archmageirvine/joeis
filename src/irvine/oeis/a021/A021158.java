package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021158 Decimal expansion of 1/154.
 * @author Sean A. Irvine
 */
public class A021158 extends PrependSequence {

  /** Construct the sequence. */
  public A021158() {
    super(new PeriodicSequence(0, 6, 4, 9, 3, 5), 0);
  }
}
