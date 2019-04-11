package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273220 <code>a(n) = 8n^2 - 12n + 1</code>.
 * @author Sean A. Irvine
 */
public class A273220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273220() {
    super(new long[] {1, -3, 3}, new long[] {9, 37, 81});
  }
}
