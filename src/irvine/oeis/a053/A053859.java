package irvine.oeis.a053;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A053859 Number of n X n matrices over GF(4) of order dividing 4 (i.e., number of solutions of X^4=I in GL(n,4)).
 * @author Sean A. Irvine
 */
public class A053859 extends A053718 {

  /** Construct the sequence. */
  public A053859() {
    super(4, new GaloisField(Z.TWO, 2));
  }
}
