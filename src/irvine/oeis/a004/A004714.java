package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004714 Positions of ones in binary expansion of the reciprocal of the golden ratio (0.618...).
 * @author Sean A. Irvine
 */
public class A004714 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004714() {
    super(false, 2);
    super.next();
  }

  @Override
  protected CR getCR() {
    return CR.PHI;
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
