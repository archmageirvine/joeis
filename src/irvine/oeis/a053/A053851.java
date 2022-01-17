package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053851 Number of n X n matrices over GF(3) of order dividing 6 (i.e., number of solutions of X^6=I in GL(n,3)).
 * @author Sean A. Irvine
 */
public class A053851 extends A053718 {

  /** Construct the sequence. */
  public A053851() {
    super(6, new GaloisField(3));
  }
}
