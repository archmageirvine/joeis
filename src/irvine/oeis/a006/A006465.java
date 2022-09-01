package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A006465 Continued fraction for 4^5*Sum_{n&gt;=0} 1/4^(2^n).
 * @author Georg Fischer
 */
public class A006465 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A006465() {
    super(0, k -> Z.valueOf(1024), new long[] {324, 63, 1});
    setStart(2);
  }
}
