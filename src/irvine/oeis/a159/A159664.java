package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159664.
 * @author Sean A. Irvine
 */
public class A159664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159664() {
    super(new long[] {-1, 24}, new long[] {1, 23});
  }
}
