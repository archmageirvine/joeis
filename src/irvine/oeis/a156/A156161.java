package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156161 a(n) = 34*a(n-1)-a(n-2)-2312 for n &gt; 2; a(1)=289, a(2)=7225.
 * @author Sean A. Irvine
 */
public class A156161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156161() {
    super(new long[] {1, -35, 35}, new long[] {289, 7225, 243049});
  }
}
