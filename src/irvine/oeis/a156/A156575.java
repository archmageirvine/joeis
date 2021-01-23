package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156575 a(n) = 34*a(n-1)-a(n-2)-4232 for n &gt; 2; a(1)=289, a(2)=4225.
 * @author Sean A. Irvine
 */
public class A156575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156575() {
    super(new long[] {1, -35, 35}, new long[] {289, 4225, 139129});
  }
}
