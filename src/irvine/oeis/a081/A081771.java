package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A081771 Continued fraction for Sum_{k&gt;=0} 1/3^(2^k-1).
 * @author Sean A. Irvine
 */
public class A081771 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081771() {
    super(0, k -> Z.THREE, 1, 2, 1);
    setStart(2);
  }
}
