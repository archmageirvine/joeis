package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156568 <code>a(n) = 6*a(n-1)-a(n-2)</code> for <code>n &gt; 2</code>; <code>a(1)=23, a(2)=115</code>.
 * @author Sean A. Irvine
 */
public class A156568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156568() {
    super(new long[] {-1, 6}, new long[] {23, 115});
  }
}
