package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157757.
 * @author Sean A. Irvine
 */
public class A157757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157757() {
    super(new long[] {1, -3, 3}, new long[] {89, 3898, 13325});
  }
}
