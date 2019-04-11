package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126426 <code>a(n) = n^5 - n - 1</code>.
 * @author Sean A. Irvine
 */
public class A126426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126426() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {-1, 29, 239, 1019, 3119, 7769});
  }
}
