package irvine.oeis.a197;

import irvine.oeis.LinearRecurrence;

/**
 * A197652 Numbers that are congruent to 0 or <code>1 mod 10</code>.
 * @author Sean A. Irvine
 */
public class A197652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197652() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 10});
  }
}
