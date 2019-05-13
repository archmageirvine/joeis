package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021596.
 * @author Sean A. Irvine
 */
public class A021596 extends PrependSequence {

  /** Construct the sequence. */
  public A021596() {
    super(new PeriodicSequence(8, 9, 1), 0, 0, 1, 6);
  }
}

