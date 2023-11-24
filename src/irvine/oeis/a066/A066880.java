package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066880 Biased numbers: n such that all terms of the sequence f(n), f(f(n)), f(f(f(n))), ..., 1, where f(k) = Floor(k/2), are odd.
 * @author Sean A. Irvine
 */
public class A066880 extends Sequence1 {

  private long mN = 1;
  private Z mT = null;

  @Override
  public Z next() {
    if (mT != null) {
      final Z r = mT;
      mT = null;
      return r;
    }
    final Z a = Z.ONE.shiftLeft(++mN).subtract(2);
    mT = a.add(1);
    return a;
  }
}
