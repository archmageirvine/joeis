package irvine.oeis.a068;
// manually 2024-02-03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A068413 a(n) = number of partitions of 2^n.
 * @author Georg Fischer
 */
public class A068413 extends LambdaSequence {

  /** Construct the sequence. */
  public A068413() {
    super(0, n -> Functions.PARTITIONS.z(Z.ONE.shiftLeft(n)));
  }
}
