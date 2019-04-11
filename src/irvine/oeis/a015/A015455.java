package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015455 <code>a(n) = 9*a(n-1) + a(n-2)</code> for <code>n&gt;1</code>; <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A015455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015455() {
    super(new long[] {1, 9}, new long[] {1, 1});
  }
}
