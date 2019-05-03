package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140992 <code>a(0)=0, a(1)=1</code>; for <code>n&gt;1 a(n)=a(n-2)+a(n-1)+A000071(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A140992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140992() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {0, 1, 2, 5, 11});
  }
}
