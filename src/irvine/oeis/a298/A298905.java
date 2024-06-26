package irvine.oeis.a298;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A298905 Expansion of e.g.f. Product_{k&gt;=1} (1 + log(1 + x)^k).
 * @author Georg Fischer
 */
public class A298905 extends LambdaSequence {

  /** Construct the sequence. */
  public A298905() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.STIRLING1.z(n, k).multiply(Functions.DISTINCT_PARTITIONS.z(k)).multiply(Functions.FACTORIAL.z(k))));
  }
}
