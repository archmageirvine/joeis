package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021136.
 * @author Sean A. Irvine
 */
public class A021136 extends PrependSequence {

  /** Construct the sequence. */
  public A021136() {
    super(new PeriodicSequence(7, 5), 0, 0);
  }
}
