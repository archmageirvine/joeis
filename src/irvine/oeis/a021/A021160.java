package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021160.
 * @author Sean A. Irvine
 */
public class A021160 extends PrependSequence {

  /** Construct the sequence. */
  public A021160() {
    super(new PeriodicSequence(6, 4, 1, 0, 2, 5), 0, 0);
  }
}
