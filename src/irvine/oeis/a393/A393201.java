package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A393201 Numbers k that are neither squarefree nor prime powers, such that k/rad(k) != lpf(k), where rad = A007947 and lpf = A020639.
 * @author Sean A. Irvine
 */
public class A393201 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393201() {
    super(1, k -> {
      if (Predicates.SQUARE_FREE.is(k)) {
        return false;
      }
      if (Predicates.PRIME_POWER.is(k)) {
        return false;
      }
      return k / Functions.RAD.l(k) != Functions.LPF.l(k);
    });
  }
}

