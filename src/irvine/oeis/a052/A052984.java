package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052984 <code>a(n) = 5*a(n-1) - 2*a(n-2)</code> for <code>n&gt;1</code>, with <code>a(0) = 1, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A052984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052984() {
    super(new long[] {-2, 5}, new long[] {1, 3});
  }
}
