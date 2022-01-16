package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053847 Number of n X n matrices over GF(3) of order dividing 3 (i.e., number of solutions of X^3=I in GL(n,3)).
 * @author Sean A. Irvine
 */
public class A053847 extends A053718 {

  /** Construct the sequence. */
  public A053847() {
    super(3, new GaloisField(3));
  }
}
