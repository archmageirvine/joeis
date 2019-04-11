package irvine.oeis.a279;

import irvine.oeis.FiniteSequence;

/**
 * A279687 <code>a(0) = 1, a(n)</code> is the least prime factor of <code>a(n-1)^2+1</code> that has not previously appeared in the sequence for <code>n &gt; 0</code>.
 * @author Georg Fischer
 */
public class A279687 extends FiniteSequence {

  /** Construct the sequence. */
  public A279687() {
    super(1, 2, 5, 13, 17, 29, 421, 401, 37, 1877, 41);
  }
}
