package irvine.oeis.a324;

import irvine.oeis.FiniteSequence;

/**
 * A324223 <code>a(n)</code> is defined by the condition that the decimal expansion of the Sum_{n&gt;0} <code>1/a(n)^n = 1/a(1)^1 - 1/a(2)^2 + 1/a(3)^3 - </code>... begins with the concatenation of these numbers; also <code>a(1) = 3</code> and <code>a(n) &gt; a(n-1)</code>.
 * @author Georg Fischer
 */
public class A324223 extends FiniteSequence {

  /** Construct the sequence. */
  public A324223() {
    super(3, 32, 37, 64, 533, 960);
  }
}
