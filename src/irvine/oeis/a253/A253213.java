package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253213 a(n) = 10^n + 9.
 * @author Sean A. Irvine
 */
public class A253213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253213() {
    super(new long[] {-10, 11}, new long[] {10, 19});
  }
}
