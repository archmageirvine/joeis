package irvine.oeis.a187;
// Generated by gen_seq4.pl 2024-04-10/simtraf at 2024-04-10 22:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a362.A362640;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A187129 Consider all pairs of primes (p,q) with p+q = 2n, p &lt;= q; a(n) is the sum of all the q's.
 * @author Georg Fischer
 */
public class A187129 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A187129() {
    super(2, new A362640().skip(1), (n, v) -> (n <= 1) ? Z.ONE : Functions.SOPF.z(v));
  }
}
