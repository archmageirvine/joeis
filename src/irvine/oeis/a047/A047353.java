package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047353.
 * @author Sean A. Irvine
 */
public class A047353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047353() {
    super(new long[] {-1, 1, 1}, new long[] {1, 2, 8});
  }
}
