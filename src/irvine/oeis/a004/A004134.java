package irvine.oeis.a004;

import irvine.math.PopCount;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004134.
 * @author Sean A. Irvine
 */
public class A004134 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(3 * mN - PopCount.popcount(mN));
  }
}
