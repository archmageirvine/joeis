package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A027896 Divisors of <code>10^11 - 1</code>.
 * @author Georg Fischer
 */
public class A027896 extends FiniteSequence {

  /** Construct the sequence. */
  public A027896() {
    super(Jaguar.factor(Z.valueOf(99999999999L)).divisorsSorted());
  }
}
