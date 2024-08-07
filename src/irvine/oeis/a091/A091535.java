package irvine.oeis.a091;
// Generated by gen_seq4.pl 2024-01-25/lambdan at 2024-01-26 22:29

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A091535 First column (k=2) of array A091534 ((5,2)-Stirling2).
 * @author Georg Fischer
 */
public class A091535 extends LambdaSequence {

  /** Construct the sequence. */
  public A091535() {
    super(1, n -> Functions.MULTIFACTORIAL.z(3, 3L * n - 2).multiply(Functions.MULTIFACTORIAL.z(3, 3L * n - 1)).divide(2));
  }
}
