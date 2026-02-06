package irvine.oeis.a083;

import java.util.Collections;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A083526 Composite n such that both n and its reversal in base 10 are squarefree, none of the prime factors of n are palindromes and the prime factors of the reversal of n are the reversals of those of n.
 * @author Sean A. Irvine
 */
public class A083526 extends A120944 {

  private boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (Predicates.PALINDROME.is(p)) {
        return false;
      }
    }
    final Z r = Functions.REVERSE.z(n);
    final FactorSequence fsr = Jaguar.factor(r);
    if (fsr.maxExponent() > 1) {
      return false;
    }
    final HashSet<Z> s = new HashSet<>();
    Collections.addAll(s, fs.toZArray());
    for (final Z p : fsr.toZArray()) {
      if (!s.contains(Functions.REVERSE.z(p))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (is(n)) {
        return n;
      }
    }
  }
}
