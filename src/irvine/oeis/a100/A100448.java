package irvine.oeis.a100;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A100448 Number of triples (i,j,k) with 1 &lt;= i &lt;= j &lt; k &lt;= n and gcd{i,j,k} = 1.
 * a(n) = (1/6)*(-1 + sum(k=1,n,moebius(k)*floor(n/k)^3))
 * @author Georg Fischer
 */
public class A100448 extends LambdaSequence {

  /** Construct the sequence. */
  public A100448() {
    super(1, n -> Z.NEG_ONE.add(Integers.SINGLETON.sum(1, n, k -> Z.valueOf(Functions.MOBIUS.i(k)).multiply(Z.valueOf(n / k).pow(3)))).divide(6));
  }
}
