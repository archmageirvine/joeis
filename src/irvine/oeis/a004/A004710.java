package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004710 Positions of ones in binary expansion of Euler's constant gamma.
 * @author Sean A. Irvine
 */
public class A004710 extends DecimalExpansionSequence {

  private static final CR N = CR.GAMMA;

  /** Construct the sequence */
  public A004710() {
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
