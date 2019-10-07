package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004134 Denominators in expansion of <code>(1-x)^{-1/4}</code> are <code>2^a(n)</code>.
 * @author Sean A. Irvine
 */
public class A004134 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(3 * mN - (long) Long.bitCount(mN));
  }
}
