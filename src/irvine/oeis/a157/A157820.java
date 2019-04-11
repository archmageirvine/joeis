package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157820 <code>27225n^2 + 2n</code>.
 * @author Sean A. Irvine
 */
public class A157820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157820() {
    super(new long[] {1, -3, 3}, new long[] {27227, 108904, 245031});
  }
}
