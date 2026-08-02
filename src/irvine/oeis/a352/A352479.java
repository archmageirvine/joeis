package irvine.oeis.a352;
// manually 2026-08-02

import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A352479 Expansion of g.f.: 1/Sum_{p odd prime} x^p (odd powers only).
 * @author Georg Fischer
 */
public class A352479 extends PrependSequence {

  /** Construct the sequence. */
  public A352479() {
    super(-2, new MultiTransformSequence(-2, (self, n) -> n == -2 ? Z.ONE : Integers.SINGLETON.sum(1, n + 2,
      k -> {
        final long nmk = n - k;
        return (Predicates.PRIME.is(2 * k + 3) ? Z.ONE : Z.ZERO)
          .multiply(nmk == -2 ? Z.ONE : (nmk == -1 ? Z.NEG_ONE : self.a(nmk)));
      }).negate(), "").skip(1), 1, -1, 0);
  }
}
