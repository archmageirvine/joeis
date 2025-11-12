package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A081772 Continued fraction for Sum_{k&gt;=0} 1/4^(2^k-1).
 * @author Sean A. Irvine
 */
public class A081772 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081772() {
    super(0, k -> Z.FOUR, 1, 3, 1);
    setStart(2);
  }
}
