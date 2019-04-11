package irvine.oeis.a217;

import irvine.oeis.FiniteSequence;

/**
 * A217290 Integers n such that 2*cos(2*Pi/n) is <code>an</code> integer.
 * @author Georg Fischer
 */
public class A217290 extends FiniteSequence {

  /** Construct the sequence. */
  public A217290() {
    super(-6, -4, -3, -2, -1, 1, 2, 3, 4, 6);
  }
}
