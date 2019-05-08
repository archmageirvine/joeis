package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021179.
 * @author Sean A. Irvine
 */
public class A021179 extends PrependSequence {

  /** Construct the sequence. */
  public A021179() {
    super(new PeriodicSequence(5, 7, 1, 4, 2, 8), 0, 0);
  }
}
