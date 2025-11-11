package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A006466.
 * @author Sean A. Irvine
 */
public class A081775 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081775() {
    super(0, k -> Z.SEVEN, 1, 6, 1);
    setStart(2);
  }
}
