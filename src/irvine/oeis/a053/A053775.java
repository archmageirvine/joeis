package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053775 Number of n X n binary matrices of order dividing 10 (i.e., number of solutions of X^10=I in GL(n,2)).
 * @author Sean A. Irvine
 */
public class A053775 extends A053718 {

  /** Construct the sequence. */
  public A053775() {
    super(10, new GaloisField(2));
  }
}
