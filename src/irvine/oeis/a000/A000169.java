package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000169 Number of labeled rooted trees with n nodes: n^(n-1).
 * @author Sean A. Irvine
 */
public class A000169 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN - 1);
  }
}

