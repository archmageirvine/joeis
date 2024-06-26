package irvine.oeis.a278;
// Generated by gen_seq4.pl 2024-03-14g/lambdan at 2024-03-14 21:15

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A278559 a(n) = A000041(25*n + 24).
 * @author Georg Fischer
 */
public class A278559 extends LambdaSequence {

  /** Construct the sequence. */
  public A278559() {
    super(0, n -> Functions.PARTITIONS.z(n * 25 + 24));
  }
}
