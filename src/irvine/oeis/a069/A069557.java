package irvine.oeis.a069;

import irvine.oeis.a000.A000290;

/**
 * A069557 Squares in which the k-th significant digit either divides k or is a multiple of k. Is 1 only in case k has no other single-digit divisor.
 * @author Sean A. Irvine
 */
public class A069557 extends A069556 {

  /** Construct the sequence. */
  public A069557() {
    super(new A000290().skip());
  }
}
