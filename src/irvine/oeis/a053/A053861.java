package irvine.oeis.a053;

import irvine.math.group.GaloisField;
import irvine.math.z.Z;

/**
 * A053861 Number of n X n matrices over GF(4) of order dividing 6 (i.e., number of solutions of X^6=I in GL(n,4)).
 * @author Sean A. Irvine
 */
public class A053861 extends A053718 {

  /** Construct the sequence. */
  public A053861() {
    super(6, new GaloisField(Z.TWO, 2));
  }
}
