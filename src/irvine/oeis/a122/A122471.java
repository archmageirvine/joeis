package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122471 a(n)=7*a(n-1)-n for n&gt; 0, a(0)=1.
 * @author Sean A. Irvine
 */
public class A122471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122471() {
    super(new long[] {7, -15, 9}, new long[] {1, 6, 40});
  }
}
