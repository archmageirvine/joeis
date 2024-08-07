package irvine.oeis.a131;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A131674 Size of the largest BDD of symmetric Boolean functions of n variables when the sink nodes are not counted.
 * @author Georg Fischer
 */
public class A131674 extends LambdaSequence {

  /** Construct the sequence. */
  public A131674() {
    super(0, n -> Integers.SINGLETON.sum(1, n, k -> Functions.MIN.z(Z.valueOf(k), Z.TWO.pow(n + 2 - k).subtract(2))));
  }
}
