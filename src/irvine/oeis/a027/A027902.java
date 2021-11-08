package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A027902 Divisors of 3^24 - 1.
 * @author Sean A. Irvine
 */
public class A027902 extends FiniteSequence {

  /** Construct the sequence. */
  public A027902() {
    super(Jaguar.factor(Z.valueOf(282429536480L)).divisorsSorted());
  }
}
