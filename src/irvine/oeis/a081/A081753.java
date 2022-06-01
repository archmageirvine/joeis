package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081753 a(n) = floor(n/12) if n==2 (mod 12); a(n)=floor(n/12)+1 otherwise.
 * @author Sean A. Irvine
 */
public class A081753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081753() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2});
  }
}
