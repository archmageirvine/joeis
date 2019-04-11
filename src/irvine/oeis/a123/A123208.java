package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123208 Start with <code>1,</code> then alternately add 2 or double.
 * @author Sean A. Irvine
 */
public class A123208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123208() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 3, 6, 8});
  }
}
