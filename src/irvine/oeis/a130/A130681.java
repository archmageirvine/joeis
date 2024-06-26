package irvine.oeis.a130;
// Generated by gen_seq4.pl 2024-06-19/lambdan at 2024-06-19 23:57

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a228.A228426;

/**
 * A130681 Sum[ 1/k^(2p-1), {k,1,p-1}] divided by p^3, for prime p&gt;3.
 * @author Georg Fischer
 */
public class A130681 extends LambdaSequence {

  private static final DirectSequence A228426 = new A228426();

  /** Construct the sequence. */
  public A130681() {
    super(3, n -> A228426.a(Functions.PRIME.z(n)).divide(Functions.PRIME.z(n).pow(3)));
  }
}
