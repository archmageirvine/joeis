package irvine.oeis.a308;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308481 a(n) = Sum_{k=1..n, gcd(n,k) = 1} k^n.
 * @author Georg Fischer
 */
public class A308481 extends LambdaSequence {

  /** Construct the sequence. */
  public A308481() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.GCD.i(n, k) != 1 ? Z.ZERO : Z.valueOf(k).pow(n)));
  }
}
