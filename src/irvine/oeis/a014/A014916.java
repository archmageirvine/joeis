package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014916.
 * @author Sean A. Irvine
 */
public class A014916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014916() {
    super(new long[] {16, -24, 9}, new long[] {1, 9, 57});
  }
}
