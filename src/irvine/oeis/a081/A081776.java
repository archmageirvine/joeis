package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A006466.
 * @author Sean A. Irvine
 */
public class A081776 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081776() {
    super(0, k -> Z.EIGHT, 1, 7, 1);
    setStart(2);
  }
}
