package irvine.oeis.a235;
// Generated by gen_seq4.pl 2024-07-26/lambdan at 2024-07-27 00:11

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A235137 a(n) = Sum_{k = 1..n} k^phi(n), where phi(n) = A000010(n).
 * @author Georg Fischer
 */
public class A235137 extends LambdaSequence {

  /** Construct the sequence. */
  public A235137() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k).pow(Functions.PHI.z(n))));
  }
}
