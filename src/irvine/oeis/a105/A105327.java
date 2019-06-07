package irvine.oeis.a105;

import irvine.oeis.FiniteSequence;

/**
 * A105327 Numbers n such that <code>pi(n)=pi(d_1!)+pi(d_2!)+...+pi(d_k!)</code> where <code>d_1 d_2 ...d_k</code> is the decimal expansion of <code>n</code>.
 * @author Georg Fischer
 */
public class A105327 extends FiniteSequence {

  /** Construct the sequence. */
  public A105327() {
    super(0, 1, 2, 115, 1626, 5370, 5371, 5570, 5571, 6170, 6171, 40854, 373369, 373469, 419386, 419658, 419685, 889609, 889619);
  }
}
