package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004712 Positions of ones in binary expansion of e-2.
 * @author Sean A. Irvine
 */
public class A004712 extends DecimalExpansionSequence {

  private static final CR N = CR.E;

  /** Construct the sequence */
  public A004712() {
    super(false, 2);
    super.next();
  }

  @Override
  protected CR getCR() {
    return N;
  }

  private long mPos = -1;

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
