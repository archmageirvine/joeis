package irvine.oeis.a069;

import irvine.oeis.a000.A000290;

/**
 * A069560 Squares in which the k-th significant digit either divides k or is a multiple of k.
 * @author Sean A. Irvine
 */
public class A069560 extends A069559 {

  /** Construct the sequence. */
  public A069560() {
    super(new A000290().skip());
    setOffset(0);
  }
}
