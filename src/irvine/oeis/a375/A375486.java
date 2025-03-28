package irvine.oeis.a375;
// Generated by gen_seq4.pl 2025-02-02.ack/lambdan at 2025-02-02 21:39

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A375486 a(n) is the number of integers k between 0 and n such that n OR k is a prime number (where OR denotes the bitwise OR operator).
 * @author Georg Fischer
 */
public class A375486 extends LambdaSequence {

  /** Construct the sequence. */
  public A375486() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(Z.valueOf(n | k).isProbablePrime() ? 1 : 0)));
  }
}
