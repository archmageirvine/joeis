package irvine.oeis.a053;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A053856 Number of n X n matrices over GF(4) of order dividing 2 (i.e., number of solutions of X^2=I in GL(n,4)).
 * @author Sean A. Irvine
 */
public class A053856 extends A053718 {

  /** Construct the sequence. */
  public A053856() {
    super(2, new GaloisField(Z.TWO, 2));
  }
}
