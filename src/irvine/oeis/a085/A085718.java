package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085718 Numbers k such that sopfr(k)/lpf(k) is a semiprime and sopfr(k)/gpf(k) is a semiprime and lpf(k) != gpf(k),  where sopfr = A001414, lpf =  A020639, gpf = A006530.
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

