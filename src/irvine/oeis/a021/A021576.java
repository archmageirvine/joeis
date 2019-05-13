package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021576.
 * @author Sean A. Irvine
 */
public class A021576 extends PrependSequence {

  /** Construct the sequence. */
  public A021576() {
    super(new PeriodicSequence(1, 7, 4, 8, 2, 5), 0, 0);
  }
}
