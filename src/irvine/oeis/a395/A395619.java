package irvine.oeis.a395;
// manually 2026-06-23/multia at 2026-06-23 22:01

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A395619 For any n &gt; 0 with prime factorization Prod_{i = 1..k} p_i^e_i where p_1 &lt; ... &lt; p_k and e_1, ..., e_k &gt; 0, a(n) = Prod_{i = 1..k} prime(i)^a(e_i) (where prime(i) denotes the i-th prime numbers).
 * @author Georg Fischer
 */
public class A395619 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A395619() {
    super(1, (self, n) -> {
        final FactorSequence fs = Jaguar.factor(n);
        long i = 0L;
        Z x = Z.ONE;
        for (final Z p : fs.toZArray()) {
          final int e = fs.getExponent(p);
          x = x.multiply(Functions.PRIME.z(++i).pow(self.a(e)));
        }
        return x;
      }
      , "1");
  }
}
