package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A027890 Divisors of 99999999.
 * @author Sean A. Irvine
 */
public class A027890 extends FiniteSequence {

  /** Construct the sequence. */
  public A027890() {
    super(Jaguar.factor(Z.valueOf(99999999)).divisorsSorted());
  }
}
