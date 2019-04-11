package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196468 <code>a(1)=11</code>; <code>a(n) = floor((2 + sqrt(8))*a(n-1))</code> for <code>n &gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A196468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196468() {
    super(new long[] {-4, 0, 5}, new long[] {11, 53, 255});
  }
}
