package irvine.oeis.a121;

import irvine.oeis.FiniteSequence;

/**
 * A121106 Trajectory of 6788 under "x -&gt; product of digits of x" map.
 * @author Georg Fischer
 */
public class A121106 extends FiniteSequence {

  /** Construct the sequence. */
  public A121106() {
    super(1, FINITE, 6788, 2688, 768, 336, 54, 20, 0);
  }
}
