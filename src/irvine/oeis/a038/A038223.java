package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038223.
 * @author Sean A. Irvine
 */
public class A038223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038223() {
    super(new long[] {1, -5, 6}, new long[] {1, 6, 31});
  }
}
