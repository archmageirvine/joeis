package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125831 <code>a(n) = (5^n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A125831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125831() {
    super(new long[] {-5, 6}, new long[] {0, 2});
  }
}
