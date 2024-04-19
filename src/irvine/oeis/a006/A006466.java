package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A006466 Continued fraction expansion of C = 2*Sum_{n&gt;=0} 1/2^(2^n).
 * @author Georg Fischer
 */
public class A006466 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A006466() {
    super(0, k -> Z.TWO, 1, 1, 1);
    setStart(2);
  }
}
