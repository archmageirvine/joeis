package irvine.oeis.a116;

import irvine.oeis.FiniteSequence;

/**
 * A116889 <code>a(n)</code> is the least prime p that remains prime through n iterations of function f(p)=p^2+4.
 * @author Georg Fischer
 */
public class A116889 extends FiniteSequence {

  /** Construct the sequence. */
  public A116889() {
    super(2, 3, 3, 5087, 306167);
  }
}
