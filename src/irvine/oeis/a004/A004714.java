package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004714 Positions of ones in binary expansion of the reciprocal of the golden ratio (0.618...).
 * @author Sean A. Irvine
 */
public class A004714 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004714() {
    super(1, CR.PHI, 2);
    super.next();
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
