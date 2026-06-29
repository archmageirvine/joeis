package irvine.oeis.a194;
// manually 2026-06-29*

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A194545 Total sum of nonprime parts in all partitions of n.
 * @author Georg Fischer
 */
public class A194545 extends LambdaSequence {

  /** Construct the sequence. */
  public A194545() {
    super(0, n -> Functions.PARTITIONS.z(n).multiply(n).subtract(
      Integers.SINGLETON.sum(1, n, k -> Functions.SOPF.z(k).multiply(Functions.PARTITIONS.z(n - k)))
    ));
  }
}
