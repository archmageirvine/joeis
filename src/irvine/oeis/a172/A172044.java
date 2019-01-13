package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172044.
 * @author Sean A. Irvine
 */
public class A172044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172044() {
    super(new long[] {1, -3, 3}, new long[] {1, 17, 43});
  }
}
