package irvine.oeis.a184;
// manually floor at 2021-08-31 14:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A184007 floor(n*s+h-h*s), where s=(3+sqrt(3))/2, h=-1/3.  Complement of A184006.
 * @author Georg Fischer
 */
public class A184007 extends FloorSequence {

  private final CR mR = CR.THREE.sqrt();
  private final CR mH = CR.ONE_THIRD.negate();
  private final CR mS = mR.divide(mR.subtract(CR.ONE));

  /** Construct the sequence */
  public A184007() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return mS.multiply(CR.valueOf(n)).add(mH).subtract(mH.multiply(mS)).floor();
  }

}
