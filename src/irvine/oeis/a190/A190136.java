package irvine.oeis.a190;
// Generated by gen_seq4.pl 2024-04-02/lambdan at 2024-04-02 23:05

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A190136 Largest prime factor of n*(n+1)*(n+2)*(n+3).
 * @author Georg Fischer
 */
public class A190136 extends LambdaSequence {

  /** Construct the sequence. */
  public A190136() {
    super(1, n -> Functions.GPF.z(Z.valueOf(n).multiply(n + 1).multiply(n + 2).multiply(n + 3)));
  }
}
