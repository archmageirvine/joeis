package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050919.
 * @author Sean A. Irvine
 */
public class A050919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050919() {
    super(new long[] {49, -63, 15}, new long[] {1, 8, 99});
  }
}
