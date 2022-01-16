package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053771 Number of n X n binary matrices of order dividing 6 (i.e., number of solutions of X^6=I in GL(n,2)).
 * @author Sean A. Irvine
 */
public class A053771 extends A053718 {

  /** Construct the sequence. */
  public A053771() {
    super(6, new GaloisField(2));
  }
}
