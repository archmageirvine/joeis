package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053773 Number of n X n binary matrices of order dividing 8 (i.e., number of solutions of X^8=I in GL(n,2)).
 * @author Sean A. Irvine
 */
public class A053773 extends A053718 {

  /** Construct the sequence. */
  public A053773() {
    super(8, new GaloisField(2), 0);
  }
}
