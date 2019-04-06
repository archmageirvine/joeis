package irvine.oeis.a147;

import irvine.oeis.FiniteSequence;

/**
 * A147637 a(n) = largest n-distinct-decimal-digit number such that the string formed by the last k digits is divisible by k for any 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A147637 extends FiniteSequence {

  /** Construct the sequence. */
  public A147637() {
    super(9, 98, 984, 9876, 98720, 987540, 9864120, 98765120, 876351240L, 9876351240L);
  }
}
