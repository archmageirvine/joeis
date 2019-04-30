package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156573 <code>a(n) = 34*a(n-1)-a(n-2)-4232</code> for <code>n &gt; 2; a(1)=529, a(2)=13225</code>.
 * @author Sean A. Irvine
 */
public class A156573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156573() {
    super(new long[] {1, -35, 35}, new long[] {529, 13225, 444889});
  }
}
