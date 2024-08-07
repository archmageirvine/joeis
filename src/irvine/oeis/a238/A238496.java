package irvine.oeis.a238;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A238496 Number of prime factors in A052129(n).
 * @author Georg Fischer
 */
public class A238496 extends LambdaSequence {

  /** Construct the sequence. */
  public A238496() {
    super(0, n -> Integers.SINGLETON.sum(1, n, i -> Z.TWO.pow(n - i).multiply(Functions.BIG_OMEGA.z(i))));
  }
}
