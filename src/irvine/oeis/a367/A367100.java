package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-05-17/lambdan at 2024-05-17 23:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A367100 a(n) = Sum_{k=0..n} A000108(k) * A000041(k).
 * @author Georg Fischer
 */
public class A367100 extends LambdaSequence {

  /** Construct the sequence. */
  public A367100() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.CATALAN.z(k).multiply(Functions.PARTITIONS.z(k))));
  }
}
