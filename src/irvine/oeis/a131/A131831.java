package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131831 Duplicate of A100314.
 * @author Sean A. Irvine
 */
public class A131831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131831() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 8});
  }
}
