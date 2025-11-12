package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A081773 Continued fraction for Sum_{k&gt;=0} 1/5^(2^k-1).
 * @author Sean A. Irvine
 */
public class A081773 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081773() {
    super(0, k -> Z.FIVE, 1, 4, 1);
    setStart(2);
  }
}
