package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056081 Numbers that are congruent to <code>{1,26} mod 27</code>.
 * @author Sean A. Irvine
 */
public class A056081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056081() {
    super(new long[] {-1, 1, 1}, new long[] {1, 26, 28});
  }
}
