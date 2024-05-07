package irvine.oeis.a069;

import irvine.oeis.a000.A000217;

/**
 * A069558 Triangular numbers in which the k-th digit, numbering them from right to left, either divides k or is a nonzero multiple of k. Is 1 only when k has no other single-digit divisor (less than 10).
 * @author Sean A. Irvine
 */
public class A069558 extends A069556 {

  /** Construct the sequence. */
  public A069558() {
    super(new A000217().skip());
  }
}
