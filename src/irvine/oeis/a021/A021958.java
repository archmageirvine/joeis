package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021958.
 * @author Sean A. Irvine
 */
public class A021958 extends PrependSequence {

  /** Construct the sequence. */
  public A021958() {
    super(new PeriodicSequence(0, 1, 0, 4, 8, 2, 1, 8, 0, 2, 9, 3, 5), 0);
  }
}

