package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164110 <code>a(n) = 12*a(n-1) - 34*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 5, a(1) = 36</code>.
 * @author Sean A. Irvine
 */
public class A164110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164110() {
    super(new long[] {-34, 12}, new long[] {5, 36});
  }
}
