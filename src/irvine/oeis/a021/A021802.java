package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021802.
 * @author Sean A. Irvine
 */
public class A021802 extends PrependSequence {

  /** Construct the sequence. */
  public A021802() {
    super(new PeriodicSequence(0, 1, 2, 5, 3, 1, 3, 2, 8, 3, 2, 0, 8, 0, 2, 0, 0, 5), 0);
  }
}

