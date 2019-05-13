package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021546.
 * @author Sean A. Irvine
 */
public class A021546 extends PrependSequence {

  /** Construct the sequence. */
  public A021546() {
    super(new PeriodicSequence(0, 1, 8, 4, 5), 0);
  }
}
