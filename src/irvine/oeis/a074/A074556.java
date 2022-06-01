package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074556 a(n) = 3^n + 6^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074556() {
    super(new long[] {144, -90, 17}, new long[] {3, 17, 109});
  }
}
