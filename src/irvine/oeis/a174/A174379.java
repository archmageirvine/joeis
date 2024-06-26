package irvine.oeis.a174;
// Generated by gen_seq4.pl 2024-04-09/lpf at 2024-04-09 23:00

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A174379 a(n) is the largest prime factor of (n-1)^n - n^(n-1).
 * @author Georg Fischer
 */
public class A174379 extends LambdaSequence {

  /** Construct the sequence. */
  public A174379() {
    super(4, n -> Functions.GPF.z(Z.valueOf(n - 1).pow(n).subtract(Z.valueOf(n).pow(n - 1))));
  }
}
