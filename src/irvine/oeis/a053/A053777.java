package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053777 Number of n X n binary matrices of order dividing 12 (i.e., number of solutions of X^12=I in GL(n,2)).
 * @author Sean A. Irvine
 */
public class A053777 extends A053718 {

  /** Construct the sequence. */
  public A053777() {
    super(12, new GaloisField(2));
  }
}
