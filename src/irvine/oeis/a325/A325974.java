package irvine.oeis.a325;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.a000.A000203;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A325974 Arithmetic mean of {sum of non-unitary divisors} and {sum of nonsquarefree divisors}: a(n) = (1/2)*(A048146(n) + A162296(n)).
 * @author Georg Fischer
 */
public class A325974 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A325974() {
    super(1, (n, s) -> s[0].subtract(s[1]), "", new A000203(), new A325973());
  }
}
