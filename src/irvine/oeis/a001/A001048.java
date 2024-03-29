package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001048 a(n) = n! + (n-1)!.
 * @author Sean A. Irvine
 */
public class A001048 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mF;
    mF = mF.multiply(++mN);
    return mF.add(t);
  }
}
