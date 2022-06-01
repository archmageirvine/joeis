package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156573 a(n) = 34*a(n-1) - a(n-2) - 4232 for n &gt; 2; a(1)=529, a(2)=13225.
 * @author Sean A. Irvine
 */
public class A156573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156573() {
    super(new long[] {1, -35, 35}, new long[] {529, 13225, 444889});
  }
}
