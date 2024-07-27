package irvine.oeis.a370;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A370649 Dimension of space of equivariant linear maps from R^{n^3} to R^{n^3} under diagonal action of {-1, 1}^n.
 * @author Sean A. Irvine
 */
public class A370649 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(15 * ++mN).subtract(30).multiply(mN).add(16).multiply(mN);
  }
}

