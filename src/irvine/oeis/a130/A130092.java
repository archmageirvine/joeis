package irvine.oeis.a130;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A130092 Numbers with at least two factors having in their canonical prime factorization equal exponents.
 * @author Sean A. Irvine
 */
public class A130092 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A130092() {
    super(1, k -> {
      final HashSet<Integer> seen = new HashSet<>();
      final FactorSequence fs = Jaguar.factor(k);
      for (final Z p : fs.toZArray()) {
        if (!seen.add(fs.getExponent(p))) {
          return true;
        }
      }
      return false;
    });
  }
}
