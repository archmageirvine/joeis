package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-02/lambdan at 2024-04-02 23:05

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A070221 a(n)=LPF(n+1)-LPF(n), where LPF(n) denotes the largest prime factor of n.
 * @author Georg Fischer
 */
public class A070221 extends LambdaSequence {

  /** Construct the sequence. */
  public A070221() {
    super(2, n -> Functions.GPF.z(n + 1).subtract(Functions.GPF.z(n)));
  }
}
