package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074556 <code>a(n) = 3^n + 6^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A074556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074556() {
    super(new long[] {144, -90, 17}, new long[] {3, 17, 109});
  }
}
