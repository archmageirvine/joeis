package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085718 Numbers n such that sopfr(n)/spf(n) is a semiprime and sopfr(n)/lpf(n) is a semiprime, where sopfr(n) = A001414(n) is sum of primes dividing n (with repetition), spf(n) and lpf(n) are smallest and largest primes dividing n, respectively. Also, spf(n)!=lpf(n).
 * @author Sean A. Irvine
 */
public class A085718 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085718() {
    super(1, 2, k -> {
      if (Functions.OMEGA.i(k) <= 1) {
        return false;
      }
      final Z sopfr = Functions.SOPFR.z(k);
      final long lpf = Functions.LPF.l(k);
      final Z[] ql = sopfr.divideAndRemainder(lpf);
      if (!ql[1].isZero() || !Predicates.SEMIPRIME.is(ql[0])) {
        return false;
      }
      final long gpf = Functions.GPF.l(k);
      final Z[] qg = sopfr.divideAndRemainder(gpf);
      return qg[1].isZero() && Predicates.SEMIPRIME.is(qg[0]);
    });
  }
}

