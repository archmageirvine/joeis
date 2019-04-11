package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004713 Positions of ones in binary expansion of <code>1/sqrt(2)</code>.
 * @author Sean A. Irvine
 */
public class A004713 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT2.inverse();

  /** Construct the sequence */
  public A004713() {
    super(false, 2);
  }

  @Override
  protected CR getCR() {
    return N;
  }

  private long mPos = 0;

  @Override
  public Z next() {
    while (true) {
      ++mPos;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mPos);
      }
    }
  }
}
