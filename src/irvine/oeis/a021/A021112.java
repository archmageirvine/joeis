package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021112.
 * @author Sean A. Irvine
 */
public class A021112 extends PrependSequence {

  /** Construct the sequence. */
  public A021112() {
    super(new PeriodicSequence(9, 2, 5), 0, 0);
  }
}
