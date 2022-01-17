package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053854 Number of n X n matrices over GF(3) of order dividing 9, i.e., the number of solutions to X^9=I in GL(n,3)).
 * @author Sean A. Irvine
 */
public class A053854 extends A053718 {

  /** Construct the sequence. */
  public A053854() {
    super(9, new GaloisField(3));
  }
}
