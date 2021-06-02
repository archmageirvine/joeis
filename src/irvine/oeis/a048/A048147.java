package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048147 Array T read by diagonals; T(i,j) = i^2 + j^2.
 * @author Sean A. Irvine
 */
public class A048147 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN - mM).square().add(Z.valueOf(mM).square());
  }
}

