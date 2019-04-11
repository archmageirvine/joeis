package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081753 <code>a(n) = floor(n/12)</code> if <code>n==2 (mod 12)</code>; <code>a(n)=floor(n/12)+1</code> otherwise.
 * @author Sean A. Irvine
 */
public class A081753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081753() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2});
  }
}
