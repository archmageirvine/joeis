package irvine.oeis.a090;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A090982 a(n) = partitions(n)*partitions(n+1).
 * @author Georg Fischer
 */
public class A090982 extends LambdaSequence {

  /** Construct the sequence. */
  public A090982() {
    super(0, n -> Functions.PARTITIONS.z(n).multiply(Functions.PARTITIONS.z(n + 1)));
  }
}
