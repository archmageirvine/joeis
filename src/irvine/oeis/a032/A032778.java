package irvine.oeis.a032;

import irvine.oeis.FiniteSequence;

/**
 * A032778 Numbers k such that <code>k*(k+1)*(k+2)*...*(k+7) / (k+(k+1)+(k+2)+...+(k+7))</code> is an integer.
 * @author Georg Fischer
 */
public class A032778 extends FiniteSequence {

  /** Construct the sequence. */
  public A032778() {
    super(0, 1, 4, 7, 9, 14, 19, 21, 28, 34, 49, 70, 84, 109, 119, 154, 217, 259, 364, 609, 784, 1099, 1834, 5509);
  }
}
