package irvine.oeis.a327;
// manually 2025-10-29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A327601 E.g.f.: exp(x) * Product_{k&gt;=1} (1 + (1 - exp(x))^k).
 * @author Georg Fischer
 */
public class A327601 extends LambdaSequence {

  /** Construct the sequence. */
  public A327601() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(k).multiply(Functions.STIRLING2.z(n + 1, k + 1)).multiply(Functions.FACTORIAL.z(k)).multiply(Functions.PARTITIONS.z(k))));
  }
}
