package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034111 Decimal part of square root of a(n) starts with 5: first term of runs.
 * @author Sean A. Irvine
 */
public class A034111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034111() {
    super(new long[] {1, -3, 3}, new long[] {21, 31, 43});
  }
}
