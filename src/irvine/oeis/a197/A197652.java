package irvine.oeis.a197;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A197652 Numbers that are congruent to 0 or 1 mod 10.
 * @author Sean A. Irvine
 */
public class A197652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197652() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 10});
  }
}
