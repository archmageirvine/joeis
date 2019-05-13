package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021868.
 * @author Sean A. Irvine
 */
public class A021868 extends PrependSequence {

  /** Construct the sequence. */
  public A021868() {
    super(new PeriodicSequence(7, 4, 0), 0, 0, 1, 1, 5);
  }
}

