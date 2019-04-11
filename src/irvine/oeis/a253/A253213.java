package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253213 <code>a(n) = 10^n + 9</code>.
 * @author Sean A. Irvine
 */
public class A253213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253213() {
    super(new long[] {-10, 11}, new long[] {10, 19});
  }
}
