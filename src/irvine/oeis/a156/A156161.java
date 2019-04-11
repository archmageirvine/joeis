package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156161 <code>a(n) = 34*a(n-1)-a(n-2)-2312</code> for <code>n &gt; 2</code>; <code>a(1)=289, a(2)=7225</code>.
 * @author Sean A. Irvine
 */
public class A156161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156161() {
    super(new long[] {1, -35, 35}, new long[] {289, 7225, 243049});
  }
}
