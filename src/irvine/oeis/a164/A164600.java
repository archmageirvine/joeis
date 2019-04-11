package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164600 <code>a(n) = 18*a(n - 1) - 79*a(n - 2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 17</code>.
 * @author Sean A. Irvine
 */
public class A164600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164600() {
    super(new long[] {-79, 18}, new long[] {1, 17});
  }
}
