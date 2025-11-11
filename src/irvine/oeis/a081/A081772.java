package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A006466 Continued fraction expansion of C = 2*Sum_{n&gt;=0} 1/2^(2^n).
 * @author Sean A. Irvine
 */
public class A081772 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081772() {
    super(0, k -> Z.FOUR, 1, 3, 1);
    setStart(2);
  }
}
