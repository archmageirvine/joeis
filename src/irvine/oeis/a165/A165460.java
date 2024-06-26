package irvine.oeis.a165;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A165460 The height at the 1/3 point of Jacobi-bridge, computed for 12n+7. a(n) = Sum_{i=0..(4n+2)} J(i,12n+7), where J(i,m) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A165460 extends LambdaSequence {

  /** Construct the sequence. */
  public A165460() {
    super(0, n -> Integers.SINGLETON.sum(0, 4 * n + 2, i -> Functions.KRONECKER.z(i, 12L * n + 7)));
  }
}
