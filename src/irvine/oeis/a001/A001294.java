package irvine.oeis.a001;

import irvine.oeis.FiniteSequence;

/**
 * A001294 Triangle in which k-th number <code>(0&lt;=k&lt;=n)</code> in n-th row <code>(0&lt;=n)</code> is number of dodecads in Golay code <code>G_24</code> containing k given points and missing n-k given points.
 * @author Sean A. Irvine
 */
public class A001294 extends FiniteSequence {

  /** Construct the sequence. */
  public A001294() {
    super(2576, 1288, 1288, 616, 672, 616, 280, 336, 336, 280, 120, 160, 176, 160, 120, 48, 72, 88, 88, 72, 48, 16, 32, 40, 48, 40, 32, 16, 0, 16, 16, 24, 24, 16, 16, 0, 0, 0, 16, 0, 24, 0, 16, 0, 0);
  }
}

