package irvine.oeis.a113;
// Generated by gen_seq4.pl 2024-07-26/lambdan at 2024-07-27 00:11

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007504;

/**
 * A113634 Sum of the first 6^n primes.
 * @author Georg Fischer
 */
public class A113634 extends LambdaSequence {

  private static final DirectSequence A007504 = new A007504();

  /** Construct the sequence. */
  public A113634() {
    super(0, n -> A007504.a(Z.SIX.pow(Z.valueOf(n))));
  }
}
