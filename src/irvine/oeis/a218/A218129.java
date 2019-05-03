package irvine.oeis.a218;

import irvine.oeis.FiniteSequence;

/**
 * A218129 <code>2^(((c - 2)^2 + (c - 2))/2) + n = a(n)</code>, where c are the positive solutions to <code>{y</code> in N <code>| 2*cos(2*Pi/y)</code> is in <code>Z}; c = {1,2,3,4,6}</code>.
 * @author Georg Fischer
 */
public class A218129 extends FiniteSequence {

  /** Construct the sequence. */
  public A218129() {
    super(1, 2, 4, 11, 1028);
  }
}
