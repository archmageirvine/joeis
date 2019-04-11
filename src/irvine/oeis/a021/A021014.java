package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021014 <code>a(n)=a(n-1)+a(n-2)-a(n-4)+a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A021014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021014() {
    super(new long[] {1, -1, 0, 1, 1}, new long[] {7, 11, 17, 26, 40});
  }
}
