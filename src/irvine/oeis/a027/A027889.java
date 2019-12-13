package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A027889 Divisors of 999999999.
 * @author Georg Fischer
 */
public class A027889 extends FiniteSequence {

  /** Construct the sequence. */
  public A027889() {
    super(Jaguar.factor(Z.valueOf(999999999L)).divisorsSorted());
  }
}
