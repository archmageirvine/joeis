package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a003.A003022;

/**
 * A039953 Triangle of "canonical" optimal Golomb rulers.
 * @author Sean A. Irvine
 */
public class A039953 extends A003022 {

  /** Construct the sequence. */
  public A039953() {
    super(1);
  }

  {
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mPositions.length) {
      super.next();
      mN = 1;
    }
    return Z.valueOf(mPositions[mN] - mPositions[mN - 1]);
  }
}
