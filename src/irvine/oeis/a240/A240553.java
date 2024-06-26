package irvine.oeis.a240;
// Generated by gen_seq4.pl 2024-04-09/lpf at 2024-04-09 23:00

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A240553 Greatest prime factor of n^10+1.
 * @author Georg Fischer
 */
public class A240553 extends LambdaSequence {

  /** Construct the sequence. */
  public A240553() {
    super(1, n -> Functions.GPF.z(Z.valueOf(n).pow(10).add(1)));
  }
}
