package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169610 Numbers that are congruent to <code>{5, 30} mod 37</code>.
 * @author Sean A. Irvine
 */
public class A169610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169610() {
    super(new long[] {-1, 1, 1}, new long[] {5, 30, 42});
  }
}
