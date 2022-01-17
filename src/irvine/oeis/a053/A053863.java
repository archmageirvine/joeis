package irvine.oeis.a053;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A053863 Number of n X n matrices over GF(4) of order dividing 8 (i.e., number of solutions of X^8=I in GL(n,4)).
 * @author Sean A. Irvine
 */
public class A053863 extends A053718 {

  /** Construct the sequence. */
  public A053863() {
    super(8, new GaloisField(Z.TWO, 2));
  }
}
