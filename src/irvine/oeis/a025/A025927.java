package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025927 Expansion of <code>1/((1-2x)(1-3x)(1-4x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A025927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025927() {
    super(new long[] {-240, 284, -116, 19}, new long[] {1, 19, 245, 2735});
  }
}
