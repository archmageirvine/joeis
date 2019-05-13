package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021880.
 * @author Sean A. Irvine
 */
public class A021880 extends PrependSequence {

  /** Construct the sequence. */
  public A021880() {
    super(new PeriodicSequence(1, 1, 4, 1, 5, 5, 2, 5), 0, 0);
  }
}

