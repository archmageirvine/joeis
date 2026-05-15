package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395007 Integers x such that there exist two integers 0&lt;y&lt;=z such that sigma(x)*psi(x)*phi(x) = x^3 + y^3 + z^3.
 * @author Sean A. Irvine
 */
public class A395007 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395007() {
    super(1, x -> {
      final Z t = Functions.SIGMA1.z(x).multiply(Functions.DEDEKIND_PSI.z(x)).multiply(Functions.PHI.z(x)).subtract(Z.valueOf(x).pow(3));
      if (t.signum() <= 0) {
        return false;
      }
      long u = 0;
      while (true) {
        final Z v = t.subtract(Z.valueOf(++u).pow(3));
        if (v.signum() <= 0) {
          return false;
        }
        if (Predicates.CUBE.is(v)) {
          return true;
        }
      }
    });
  }
}
