package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164938 <code>a(n) = (n^5-n)/10,</code> which is always <code>an</code> integer.
 * @author Sean A. Irvine
 */
public class A164938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164938() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 3, 24, 102, 312, 777});
  }
}
