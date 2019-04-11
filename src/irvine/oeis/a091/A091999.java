package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091999 Numbers that are congruent to <code>{2, 10} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A091999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091999() {
    super(new long[] {-1, 1, 1}, new long[] {2, 10, 14});
  }
}
