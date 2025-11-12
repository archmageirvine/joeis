package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A081775 Continued fraction for Sum_{k&gt;=0} 1/7^(2^k-1).
 * @author Sean A. Irvine
 */
public class A081775 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081775() {
    super(0, k -> Z.SEVEN, 1, 6, 1);
    setStart(2);
  }
}
