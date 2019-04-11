package irvine.oeis.a001;

import irvine.oeis.FiniteSequence;

/**
 * A001295 Triangle in which k-th number (0&lt;=k&lt;=n) in n-th row <code>(0&lt;=n)</code> is number of hexads in S(5,6,12) containing k given points and missing n-k given points.
 * @author Sean A. Irvine
 */
public class A001295 extends FiniteSequence {

  /** Construct the sequence. */
  public A001295() {
    super(132, 66, 66, 30, 36, 30, 12, 18, 18, 12, 4, 8, 10, 8, 4, 1, 3, 5, 5, 3, 1, 1, 0, 3, 2, 3, 0, 1);
  }
}

