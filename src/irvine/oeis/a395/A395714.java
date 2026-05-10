package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395714 Integers x&gt;0 such that there exists an integer y&gt;0 such that sigma(x)*psi(x)*phi(x) = x^3 + y^3.
 * @author Sean A. Irvine
 */
public class A395714 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395714() {
    super(1, x -> {
      final Z t = Functions.SIGMA1.z(x).multiply(Functions.DEDEKIND_PSI.z(x)).multiply(Functions.PHI.z(x)).subtract(Z.valueOf(x).pow(3));
      return t.signum() > 0 && Predicates.CUBE.is(t);
    });
  }
}
