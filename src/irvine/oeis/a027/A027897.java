package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A027897 Divisors of <code>10^12 - 1</code>.
 * @author Sean A. Irvine
 */
public class A027897 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A027897() {
    super(Jaguar.factor(Z.valueOf(999999999999L)).divisorsSorted());
  }
}
