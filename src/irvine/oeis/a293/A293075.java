package irvine.oeis.a293;
// Generated by gen_seq4.pl 2024-11-18.ack/lambdan at 2024-11-18 18:53

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A293075 Number of matchings in the complete tripartite graph K_{n,n,n}.
 * @author Georg Fischer
 */
public class A293075 extends LambdaSequence {

  /** Construct the sequence. */
  public A293075() {
    super(1, n -> Integers.SINGLETON.sum(0, n, i -> Integers.SINGLETON.sum(0, n - i, j -> Integers.SINGLETON.sum(0, Functions.MIN.i(n - i, n - j), k -> Binomial.binomial(n, i).square().multiply(Binomial.binomial(n, j)).multiply(Binomial.binomial(n - i, j)).multiply(Binomial.binomial(n - i, k)).multiply(Binomial.binomial(n - j, k)).multiply(Functions.FACTORIAL.z(i)).multiply(Functions.FACTORIAL.z(j)).multiply(Functions.FACTORIAL.z(k))))));
  }
}
