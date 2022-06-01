package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086760 a(n) = 8n^2 + 88n + 43.
 * @author Sean A. Irvine
 */
public class A086760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086760() {
    super(new long[] {1, -3, 3}, new long[] {43, 139, 251});
  }
}
