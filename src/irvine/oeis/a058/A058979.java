package irvine.oeis.a058;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058979 Number of m such that phi(m) = 4n.
 * @author Sean A. Irvine
 */
public class A058979 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    mN += 4;
    return Z.valueOf(Euler.inversePhi(Z.valueOf(mN)).size());
  }
}
