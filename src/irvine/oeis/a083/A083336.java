package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083336 a(n)=4a(n-2)-a(n-4).
 * @author Sean A. Irvine
 */
public class A083336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083336() {
    super(new long[] {-1, 0, 4, 0}, new long[] {3, 3, 9, 12});
  }
}
