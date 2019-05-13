package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021760.
 * @author Sean A. Irvine
 */
public class A021760 extends PrependSequence {

  /** Construct the sequence. */
  public A021760() {
    super(new PeriodicSequence(1, 3, 2, 2, 7, 5), 0, 0);
  }
}

