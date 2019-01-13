package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047457.
 * @author Sean A. Irvine
 */
public class A047457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047457() {
    super(new long[] {-1, 1, 1}, new long[] {3, 4, 11});
  }
}
