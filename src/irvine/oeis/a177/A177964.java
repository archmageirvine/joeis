package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177964 Indices m for which A177961(m) = 4.
 * @author Sean A. Irvine
 */
public class A177964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177964() {
    super(new long[] {-1, 1, 1}, new long[] {2, 13, 17});
  }
}
