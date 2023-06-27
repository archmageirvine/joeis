package irvine.oeis.a235;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A235700 a(n+1) = a(n) + (a(n) mod 5), a(1)=1.
 * @author Sean A. Irvine
 */
public class A235700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235700() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {1, 2, 4, 8});
  }
}
