package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021180.
 * @author Sean A. Irvine
 */
public class A021180 extends PrependSequence {

  /** Construct the sequence. */
  public A021180() {
    super(new PeriodicSequence(8, 1), 0, 0, 5, 6);
  }
}
