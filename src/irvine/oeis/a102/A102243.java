package irvine.oeis.a102;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A102243 Expansion of Pi in golden base (i.e., in irrational base phi = (1+sqrt(5))/2) = A001622.
 * @author Sean A. Irvine
 */
public class A102243 extends AbstractSequence {

  private CR mX = CR.PI.divide(CR.PHI.square());

  /** Construct the sequence. */
  public A102243() {
    super(3);
  }

  @Override
  public Z next() {
    mX = mX.multiply(CR.PHI);
    if (mX.compareTo(CR.PHI) > 0) {
      mX = mX.subtract(CR.PHI);
      return Z.ONE;
    } else {
      return Z.ZERO;
    }
  }
}
