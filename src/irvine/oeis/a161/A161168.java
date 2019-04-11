package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161168 <code>a(n) = 2^n + 4^n</code>.
 * @author Sean A. Irvine
 */
public class A161168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161168() {
    super(new long[] {-8, 6}, new long[] {2, 6});
  }
}
