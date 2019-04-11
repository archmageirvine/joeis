package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157080 <code>32805000n^2 - 16200n + 1</code>.
 * @author Sean A. Irvine
 */
public class A157080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157080() {
    super(new long[] {1, -3, 3}, new long[] {32788801, 131187601, 295196401});
  }
}
