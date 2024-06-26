package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a051.A051903;

/**
 * A357310 a(n) is the number of j in the range 1 &lt;= j &lt;= n with the same maximal exponent in prime factorization as n.
 * @author Georg Fischer
 */
public class A357310 extends LambdaSequence {

  private static final DirectSequence A051903 = new A051903();

  /** Construct the sequence. */
  public A357310() {
    super(1, n -> Integers.SINGLETON.sum(1, n, j -> A051903.a(j).equals(A051903.a(n)) ? Z.ONE : Z.ZERO));
  }
}
