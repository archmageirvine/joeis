package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155614 <code>9^n - 3^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A155614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155614() {
    super(new long[] {27, -39, 13}, new long[] {1, 7, 73});
  }
}
