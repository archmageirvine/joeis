package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021862.
 * @author Sean A. Irvine
 */
public class A021862 extends PrependSequence {

  /** Construct the sequence. */
  public A021862() {
    super(new PeriodicSequence(0, 1, 1, 6, 5, 5), 0);
  }
}

