package irvine.oeis.a056;

import irvine.oeis.InverseSequence;

/**
 * A056537 Mapping from the column-by-column reading to the half-antidiagonal reading of the triangular tables. Inverse of A056536.
 * @author Sean A. Irvine
 */
public class A056537 extends InverseSequence {

  /** Construct the sequence. */
  public A056537() {
    super(new A056536());
  }
}
