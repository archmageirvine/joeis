package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021484.
 * @author Sean A. Irvine
 */
public class A021484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021484() {
    super(new long[] {-180, 291, -131, 21}, new long[] {1, 21, 310, 4050});
  }
}
