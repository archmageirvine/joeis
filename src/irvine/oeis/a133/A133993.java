package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133993 a(n)=a(n-1)+3a(n-2)-a(n-3)-2a(n-4), n &gt; 3.
 * @author Sean A. Irvine
 */
public class A133993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133993() {
    super(new long[] {-2, -1, 3, 1}, new long[] {1, 2, 3, 4});
  }
}
