package irvine.oeis.a362;
// manually 2025-06-30

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A362832 Number of partitions of n into two distinct parts (s,t) such that phi(s) = phi(t).
 * @author Georg Fischer
 */
public class A362832 extends LambdaSequence {

  /** Construct the sequence. */
  public A362832() {
    super(1, n -> Integers.SINGLETON.count(1, (n - 1) / 2, k -> Functions.PHI.z(k).equals(Functions.PHI.z(n - k))));
  }
}
