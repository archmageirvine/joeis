package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015602 <code>a(n) = 11 a(n-1) + 8 a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A015602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015602() {
    super(new long[] {8, 11}, new long[] {0, 1});
  }
}
