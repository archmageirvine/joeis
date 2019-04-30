package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164640 <code>a(n) = 8*a(n-2)</code> for <code>n &gt; 2; a(1) = 1, a(2) = 6</code>.
 * @author Sean A. Irvine
 */
public class A164640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164640() {
    super(new long[] {8, 0}, new long[] {1, 6});
  }
}
