package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021960.
 * @author Sean A. Irvine
 */
public class A021960 extends PrependSequence {

  /** Construct the sequence. */
  public A021960() {
    super(new PeriodicSequence(1, 0, 4, 6, 0, 2, 5), 0, 0);
  }
}

