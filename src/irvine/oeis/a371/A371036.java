package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-06-25/lambdan at 2024-06-25 23:40

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A371036 a(n) is the number of ways to place n indistinguishable balls into n distinguishable boxes with at least one box remaining empty and not all balls placed in a single box.
 * @author Georg Fischer
 */
public class A371036 extends LambdaSequence {

  /** Construct the sequence. */
  public A371036() {
    super(1, n -> (n == 1) ? Z.ZERO : Binomial.binomial(2L * n - 1, n).subtract(n + 1));
  }
}
