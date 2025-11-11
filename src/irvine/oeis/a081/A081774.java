package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A006466.
 * @author Sean A. Irvine
 */
public class A081774 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081774() {
    super(0, k -> Z.SIX, 1, 5, 1);
    setStart(2);
  }
}
