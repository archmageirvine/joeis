package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003451 Number of nonequivalent dissections of an n-gon into 3 polygons by nonintersecting diagonals up to rotation.
 * @author Sean A. Irvine
 */
public class A003451 extends AbstractSequence {

  /* Construct the sequence. */
  public A003451() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Z.valueOf(mN).multiply(mN - 2).multiply(mN - 4).divide(12);
    } else {
      return Z.valueOf(mN + 1).multiply(mN - 3).multiply(mN - 4).divide(12);
    }
  }
}
