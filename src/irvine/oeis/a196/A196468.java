package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196468 a(1)=11; a(n) = floor((2 + sqrt(8))*a(n-1)) for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A196468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196468() {
    super(1, new long[] {-4, 0, 5}, new long[] {11, 53, 255});
  }
}
