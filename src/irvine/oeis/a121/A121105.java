package irvine.oeis.a121;

import irvine.oeis.FiniteSequence;

/**
 * A121105 Trajectory of 679 under "x -&gt; product of digits of x" map.
 * @author Georg Fischer
 */
public class A121105 extends FiniteSequence {

  /** Construct the sequence. */
  public A121105() {
    super(1, FINITE, 679, 378, 168, 48, 32, 6);
  }
}
