package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021368.
 * @author Sean A. Irvine
 */
public class A021368 extends PrependSequence {

  /** Construct the sequence. */
  public A021368() {
    super(new PeriodicSequence(2, 7, 4, 7, 2, 5), 0, 0);
  }
}
