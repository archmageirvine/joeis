package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131064.
 * @author Sean A. Irvine
 */
public class A131064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131064() {
    super(new long[] {2, -5, 4}, new long[] {1, 2, 8});
  }
}
