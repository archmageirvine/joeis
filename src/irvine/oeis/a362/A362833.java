package irvine.oeis.a362;
// manually 2026-06-30

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A362833 Number of partitions of n into two distinct parts (s,t) such that mu(s) = mu(t).
 * @author Georg Fischer
 */
public class A362833 extends LambdaSequence {

  /** Construct the sequence. */
  public A362833() {
    super(1, n -> Integers.SINGLETON.count(1, (n - 1) / 2, k -> Functions.MOEBIUS.z(k).equals(Functions.MOEBIUS.z(n - k))));
  }
}
