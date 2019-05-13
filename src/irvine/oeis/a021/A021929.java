package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021929.
 * @author Sean A. Irvine
 */
public class A021929 extends PrependSequence {

  /** Construct the sequence. */
  public A021929() {
    super(new PeriodicSequence(1, 0, 8), 0, 0);
  }
}

