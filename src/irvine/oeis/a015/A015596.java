package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015596 <code>a(n) = 11 a(n-1) + 4 a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A015596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015596() {
    super(new long[] {4, 11}, new long[] {0, 1});
  }
}
