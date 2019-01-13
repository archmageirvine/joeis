package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004710.
 * @author Sean A. Irvine
 */
public class A004710 extends DecimalExpansionSequence {

  private static final CR N = EulerGamma.SINGLETON;

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
