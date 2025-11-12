package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A081776 Continued fraction for Sum_{k&gt;=0} 1/8^(2^k-1).
 * @author Sean A. Irvine
 */
public class A081776 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081776() {
    super(0, k -> Z.EIGHT, 1, 7, 1);
    setStart(2);
  }
}
