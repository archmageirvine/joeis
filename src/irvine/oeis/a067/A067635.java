package irvine.oeis.a067;

import irvine.oeis.FiniteSequence;

/**
 * A067635 <code>a(1) = 1</code>; set of digits of <code>a(n)^2</code> is a proper subset of the set of digits of <code>a(n+1)^2</code>.
 * @author Georg Fischer
 */
public class A067635 extends FiniteSequence {

  /** Construct the sequence. */
  public A067635() {
    super(1, 4, 13, 36, 113, 487, 1036, 3267, 10136, 32043);
  }
}
