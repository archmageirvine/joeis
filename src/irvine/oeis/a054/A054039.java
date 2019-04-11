package irvine.oeis.a054;

import irvine.oeis.FiniteSequence;

/**
 * A054039 <code>a(n)^2</code> is the least square to contain n different decimal digits.
 * @author Georg Fischer
 */
public class A054039 extends FiniteSequence {

  /** Construct the sequence. */
  public A054039() {
    super(0, 4, 13, 32, 113, 322, 1017, 3206, 10124, 32043);
  }
}
