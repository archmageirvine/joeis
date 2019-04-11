package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085689 <code>a(1) = 4</code>; <code>a(n) =</code> if <code>n == 2 mod 3</code> then <code>a(n-1)/2,</code> if <code>n == 0 mod 3</code> then <code>a(n-1)*2,</code> if <code>n == 1 mod 3</code> then <code>a(n-1)*3</code>.
 * @author Sean A. Irvine
 */
public class A085689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085689() {
    super(new long[] {3, 0, 0}, new long[] {4, 2, 4});
  }
}
