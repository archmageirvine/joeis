package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132433 <code>a(1) = 2</code>; for <code>n&gt;=2, a(n) = 8*a(n-1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A132433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132433() {
    super(new long[] {-8, 9}, new long[] {2, 17});
  }
}
