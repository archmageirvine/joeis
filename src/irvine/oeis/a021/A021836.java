package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021836.
 * @author Sean A. Irvine
 */
public class A021836 extends PrependSequence {

  /** Construct the sequence. */
  public A021836() {
    super(new PeriodicSequence(9, 2, 3, 0, 7, 6), 0, 0, 1, 2, 0, 1);
  }
}

