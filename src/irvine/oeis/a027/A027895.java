package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A027895 Divisors of 9999999999.
 * @author Sean A. Irvine
 */
public class A027895 extends FiniteSequence {

  /** Construct the sequence. */
  public A027895() {
    super(Jaguar.factor(Z.valueOf(9999999999L)).divisorsSorted());
  }
}
