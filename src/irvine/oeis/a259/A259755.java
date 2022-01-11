package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259755 Numbers that are congruent to {4, 20} mod 24.
 * @author Sean A. Irvine
 */
public class A259755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259755() {
    super(new long[] {-1, 1, 1}, new long[] {4, 20, 28});
  }
}
