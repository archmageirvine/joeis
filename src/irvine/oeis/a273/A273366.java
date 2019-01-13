package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273366.
 * @author Sean A. Irvine
 */
public class A273366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273366() {
    super(new long[] {1, -3, 3}, new long[] {2, 22, 62});
  }
}
