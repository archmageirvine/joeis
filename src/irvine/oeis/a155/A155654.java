package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155654 <code>11^n - 6^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A155654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155654() {
    super(new long[] {66, -83, 18}, new long[] {1, 6, 86});
  }
}
