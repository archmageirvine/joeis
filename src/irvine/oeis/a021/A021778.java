package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021778.
 * @author Sean A. Irvine
 */
public class A021778 extends PrependSequence {

  /** Construct the sequence. */
  public A021778() {
    super(new PeriodicSequence(0, 1, 2, 9, 1, 9, 8, 9, 6, 6, 4, 0, 8, 2, 6, 8, 7, 3, 3, 8, 5), 0);
  }
}

