package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164553 <code>a(n) = 14*a(n-1)-43*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 11</code>.
 * @author Sean A. Irvine
 */
public class A164553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164553() {
    super(new long[] {-43, 14}, new long[] {1, 11});
  }
}
