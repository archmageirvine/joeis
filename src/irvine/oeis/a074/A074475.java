package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074475 <code>a(n) = Sum_{j=0..floor(n/2)} T(2*j + q)</code>, where <code>T(n)</code> are generalized tribonacci numbers <code>(A001644)</code> and q <code>= n - 2*floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A074475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074475() {
    super(new long[] {1, 2, 2, 0}, new long[] {3, 1, 6, 8});
  }
}
