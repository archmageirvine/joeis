package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164606 <code>a(n) = 10*a(n-1) - 17*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 21</code>.
 * @author Sean A. Irvine
 */
public class A164606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164606() {
    super(new long[] {-17, 10}, new long[] {1, 21});
  }
}
