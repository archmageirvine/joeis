package irvine.oeis.a086;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-03 21:34

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A086911 a(n) = abs(prime(n)-a(n-1)) + abs(prime(n)-a(n-2)).
 * @author Georg Fischer
 */
public class A086911 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A086911() {
    super(1, (n, s) -> {
      final Z pr = Functions.PRIME.z(n);
      return pr.subtract(s[0]).abs().add(pr.subtract(s[1]).abs());
    }, "1, 1", PREVIOUS, PREVIOUS);
  }
}
