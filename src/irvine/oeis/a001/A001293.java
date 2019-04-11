package irvine.oeis.a001;

import irvine.oeis.FiniteSequence;

/**
 * A001293 Leech triangle: k-th number <code>(0&lt;=k&lt;=n)</code> in n-th row <code>(0&lt;=n)</code> is number of octads in S(5,8,24) containing k given points and missing <code>n-k</code> given points.
 * @author Sean A. Irvine
 */
public class A001293 extends FiniteSequence {

  /** Construct the sequence. */
  public A001293() {
    super(759, 506, 253, 330, 176, 77, 210, 120, 56, 21, 130, 80, 40, 16, 5, 78, 52, 28, 12, 4, 1, 46, 32, 20, 8, 4, 0, 1, 30, 16, 16, 4, 4, 0, 0, 1, 30, 0, 16, 0, 4, 0, 0, 0, 1);
  }
}

