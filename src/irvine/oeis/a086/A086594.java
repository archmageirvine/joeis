package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086594 <code>a(n) = 8*a(n-1) + a(n-2),</code> starting with <code>a(0)=2</code> and <code>a(1)=8</code>.
 * @author Sean A. Irvine
 */
public class A086594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086594() {
    super(new long[] {1, 8}, new long[] {2, 8});
  }
}
