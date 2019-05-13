package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021742.
 * @author Sean A. Irvine
 */
public class A021742 extends PrependSequence {

  /** Construct the sequence. */
  public A021742() {
    super(new PeriodicSequence(0, 1, 3, 5, 5), 0);
  }
}

