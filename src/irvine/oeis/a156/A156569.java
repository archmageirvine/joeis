package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156569 <code>a(n) = 6*a(n-1)-a(n-2)</code> for <code>n &gt; 2</code>; <code>a(1)=37, a(2)=205</code>.
 * @author Sean A. Irvine
 */
public class A156569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156569() {
    super(new long[] {-1, 6}, new long[] {37, 205});
  }
}
