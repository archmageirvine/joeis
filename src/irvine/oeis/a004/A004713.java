package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004713 Positions of ones in binary expansion of 1/sqrt(2).
 * @author Sean A. Irvine
 */
public class A004713 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004713() {
    super(1, CR.SQRT2.inverse(), 2);
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
