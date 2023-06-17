package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003453 Number of nonequivalent dissections of an n-gon into 3 polygons by nonintersecting diagonals up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003453 extends AbstractSequence {

  /* Construct the sequence. */
  public A003453() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Z.valueOf(mN - 4).multiply(mN - 2).multiply(mN + 3).divide(24);
    } else {
      return Z.valueOf(mN).square().subtract(13).multiply(mN - 3).divide(24);
    }
  }
}
