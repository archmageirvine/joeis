package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157824 <code>3600n^2 - 6751n + 3165</code>.
 * @author Sean A. Irvine
 */
public class A157824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157824() {
    super(new long[] {1, -3, 3}, new long[] {14, 4063, 15312});
  }
}
