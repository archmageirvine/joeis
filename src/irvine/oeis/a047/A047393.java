package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047393.
 * @author Sean A. Irvine
 */
public class A047393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047393() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 8});
  }
}
