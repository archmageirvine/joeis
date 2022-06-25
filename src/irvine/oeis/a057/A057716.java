package irvine.oeis.a057;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000079;

/**
 * A057716 The nonpowers of 2.
 * @author Sean A. Irvine
 */
public class A057716 extends ComplementSequence {

  /** Construct the sequence. */
  public A057716() {
    super(new A000079());
  }
}
