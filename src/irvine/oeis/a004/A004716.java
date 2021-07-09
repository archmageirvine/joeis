package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004716 Positions of ones in the binary expansion of log(3)/log(2)-1.
 * @author Sean A. Irvine
 */
public class A004716 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.TWO.log());

  /** Construct the sequence. */
  public A004716() {
    super(false, 2);
    super.next();
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
