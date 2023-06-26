package irvine.oeis.a324;

import irvine.oeis.FiniteSequence;

/**
 * A324223 a(n) is defined by the condition that the decimal expansion of Sum_{n&gt;0} 1/a(n)^n = 1/a(1)^1 - 1/a(2)^2 + 1/a(3)^3 - ... begins with the concatenation of these numbers; also a(1) = 3 and a(n) &gt; a(n-1).
 * @author Georg Fischer
 */
public class A324223 extends FiniteSequence {

  /** Construct the sequence. */
  public A324223() {
    super(1, FINITE, 3, 32, 37, 64, 533, 960);
  }
}
