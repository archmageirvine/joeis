package irvine.oeis.a147;

import irvine.oeis.FiniteSequence;

/**
 * A147636 <code>a(n) =</code> least n-distinct-decimal-digit number such that the string formed by the last k digits is divisible by k for any <code>1&lt;=k&lt;=n</code>.
 * @author Georg Fischer
 */
public class A147636 extends FiniteSequence {

  /** Construct the sequence. */
  public A147636() {
    super(0, 10, 102, 1024, 12360, 123480, 1249360, 12495360, 123567480L, 9123567480L);
  }
}
