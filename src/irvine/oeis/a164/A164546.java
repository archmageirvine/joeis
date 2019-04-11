package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164546 <code>a(n) = 8*a(n-1)-8*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A164546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164546() {
    super(new long[] {-8, 8}, new long[] {1, 10});
  }
}
