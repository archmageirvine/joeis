package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004716 Positions of ones in the binary expansion of log(3)/log(2)-1.
 * @author Sean A. Irvine
 */
public class A004716 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004716() {
    super(0, CR.THREE.log().divide(CR.TWO.log()), 2);
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
