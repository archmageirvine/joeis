package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021444.
 * @author Sean A. Irvine
 */
public class A021444 extends PrependSequence {

  /** Construct the sequence. */
  public A021444() {
    super(new PeriodicSequence(2, 7), 0, 0, 2);
  }
}
