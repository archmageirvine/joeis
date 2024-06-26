package irvine.oeis.a340;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a336.A336466;

/**
 * A340084 a(n) = gcd(n-1, A336466(n)); Odd part of A340081(n).
 * @author Georg Fischer
 */
public class A340084 extends LambdaSequence {

  private static final DirectSequence A336466 = new A336466();

  /** Construct the sequence. */
  public A340084() {
    super(1, n -> Functions.GCD.z(Z.valueOf(n - 1), A336466.a(n)));
  }
}
