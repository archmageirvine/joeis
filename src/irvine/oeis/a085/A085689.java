package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085689 a(1) = 4; a(n) = if n == 2 mod 3 then a(n-1)/2, if n == 0 mod 3 then a(n-1)*2, if n == 1 mod 3 then a(n-1)*3.
 * @author Sean A. Irvine
 */
public class A085689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085689() {
    super(1, new long[] {3, 0, 0}, new long[] {4, 2, 4});
  }
}
