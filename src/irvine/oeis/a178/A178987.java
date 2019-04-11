package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178987 <code>a(n) = n*(n-3)*2^(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A178987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178987() {
    super(new long[] {8, -12, 6}, new long[] {0, -1, -2});
  }
}
