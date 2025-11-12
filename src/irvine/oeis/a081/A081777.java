package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A081777 Continued fraction for Sum_{k&gt;=0} 1/9^(2^k-1).
 * @author Sean A. Irvine
 */
public class A081777 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081777() {
    super(0, k -> Z.NINE, 1, 8, 1);
    setStart(2);
  }
}
