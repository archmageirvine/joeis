package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164654 <code>a(n) = 2*a(n-2)</code> for <code>n &gt; 2</code>; <code>a(1) = 3, a(2) = 8</code>.
 * @author Sean A. Irvine
 */
public class A164654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164654() {
    super(new long[] {2, 0}, new long[] {3, 8});
  }
}
