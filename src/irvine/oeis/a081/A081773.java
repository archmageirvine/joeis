package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A006466.
 * @author Sean A. Irvine
 */
public class A081773 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A081773() {
    super(0, k -> Z.FIVE, 1, 4, 1);
    setStart(2);
  }
}
