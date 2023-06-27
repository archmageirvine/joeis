package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157821 8984250n + 330.
 * @author Sean A. Irvine
 */
public class A157821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157821() {
    super(1, new long[] {-1, 2}, new long[] {8984580, 17968830});
  }
}
