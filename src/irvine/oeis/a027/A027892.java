package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A027892 Divisors of 999999.
 * @author Sean A. Irvine
 */
public class A027892 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A027892() {
    super(Jaguar.factor(Z.valueOf(999999)).divisorsSorted());
  }
}
