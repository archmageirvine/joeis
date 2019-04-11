package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157620 <code>781250n^2 - 1107500n + 392499</code>.
 * @author Sean A. Irvine
 */
public class A157620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157620() {
    super(new long[] {1, -3, 3}, new long[] {66249, 1302499, 4101249});
  }
}
