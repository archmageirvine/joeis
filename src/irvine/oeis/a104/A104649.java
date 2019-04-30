package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104649 Numerators (denominators are all 840) of x-coordinates of four points on the parabola <code>y = x^2, x &gt;= 0</code>, at rational distances (distance between <code>any</code> two points is rational).
 * @author Georg Fischer
 */
public class A104649 extends FiniteSequence {

  /** Construct the sequence. */
  public A104649() {
    super(475, 551, 799, 3076);
  }
}
