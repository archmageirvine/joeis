package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164582 <code>a(n) = 5*a(n - 1) - a(n - 2)</code>, with <code>n&gt;2, a(1)=2, a(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A164582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164582() {
    super(new long[] {-1, 5}, new long[] {2, 3});
  }
}
