package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011944 <code>a(n) = 14*a(n-1) - a(n-2)</code> with <code>a(0) = 0, a(1) = 2</code>.
 * @author Sean A. Irvine
 */
public class A011944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011944() {
    super(new long[] {-1, 14}, new long[] {0, 2});
  }
}
