package irvine.oeis.a058;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058979 Number of numbers m such that phi(m) = 4n.
 * @author Sean A. Irvine
 */
public class A058979 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    mN += 4;
    return Z.valueOf(InverseEuler.inversePhi(Z.valueOf(mN)).size());
  }
}
