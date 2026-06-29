package irvine.oeis.a362;
// manually 2026-06-29*

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A362831 Number of partitions of n into two distinct parts (s,t) such that pi(s) = pi(t).
 * @author Georg Fischer
 */
public class A362831 extends LambdaSequence {

  /** Construct the sequence. */
  public A362831() {
    super(1, n -> Integers.SINGLETON.count(1, (n - 1) / 2, k -> Functions.PRIME_PI.z(k).equals(Functions.PRIME_PI.z(n - k))));
  }
}
