package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-06-02/lambdan at 2024-06-02 23:31

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A182746 Bisection (even part) of number of partitions that do not contain 1 as a part A002865.
 * @author Georg Fischer
 */
public class A182746 extends LambdaSequence {

  /** Construct the sequence. */
  public A182746() {
    super(0, n -> Functions.PARTITIONS.z(2 * n).subtract(Functions.PARTITIONS.z(2 * n - 1)));
  }
}
