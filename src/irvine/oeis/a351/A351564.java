package irvine.oeis.a351;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a181.A181819;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A351564 a(n) = 1 if all the exponents in the prime factorization of n are distinct, and 0 otherwise.
 * @author Georg Fischer
 */
public class A351564 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A351564() {
    super(1, new A181819(), v -> Jaguar.factor(v).isSquareFree() ? Z.ONE : Z.ZERO);
  }
}
