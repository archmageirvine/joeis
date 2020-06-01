package irvine.oeis.a116;

import irvine.oeis.FiniteSequence;

/**
 * A116575 <code>a(0) = 0; a(1) = a(2) = 1</code>; for <code>n &gt; 2: a(n) = a(a(n-2)) + a(n-1 - abs(a(n-1) - a(n-2)))</code> if <code>a(n-2) &lt;</code> n, <code>a(n) = 0</code> otherwise.
 * @author Georg Fischer
 */
public class A116575 extends FiniteSequence {

  /** Construct the sequence. */
  public A116575() {
    super(0, 1, 1, 2, 2, 3, 3, 5, 5, 8, 6, 10, 8, 12, 13, 20, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
  }
}
