package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-04-22/lambdan at 2024-04-22 22:28

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A372010 a(n) is the n-digit number k such that R(k)/k is maximal for any n-digit number.
 * @author Georg Fischer
 */
public class A372010 extends LambdaSequence {

  /** Construct the sequence. */
  public A372010() {
    super(1, n -> Z.TEN.pow(n - 1).add(Z.TEN.pow(n / 2)).subtract(1));
  }
}
