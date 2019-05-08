package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021169.
 * @author Sean A. Irvine
 */
public class A021169 extends PrependSequence {

  /** Construct the sequence. */
  public A021169() {
    super(new PeriodicSequence(0, 6), 0);
  }
}
