package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155650 <code>7^n - 6^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A155650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155650() {
    super(new long[] {42, -55, 14}, new long[] {1, 2, 14});
  }
}
