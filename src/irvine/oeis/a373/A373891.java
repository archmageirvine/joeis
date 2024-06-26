package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001223;

/**
 * A373891 Number of primes less than prime(n) having the same difference between consecutive primes as prime(n).
 * @author Georg Fischer
 */
public class A373891 extends LambdaSequence {

  private static final DirectSequence A001223 = new A001223();

  /** Construct the sequence. */
  public A373891() {
    super(1, n -> Integers.SINGLETON.sum(1, n - 1, j -> A001223.a(j).equals(A001223.a(n)) ? Z.ONE : Z.ZERO));
  }
}
