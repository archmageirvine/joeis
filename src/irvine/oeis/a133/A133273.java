package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133273 Indices of centered decagonal numbers which are also decagonal numbers.
 * @author Sean A. Irvine
 */
public class A133273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133273() {
    super(1, new long[] {1, -19, 19}, new long[] {1, 10, 171});
  }
}
