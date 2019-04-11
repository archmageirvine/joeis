package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000169 Number of labeled rooted trees with n nodes: <code>n^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A000169 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN - 1);
  }
}

