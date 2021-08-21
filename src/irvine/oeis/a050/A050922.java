package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050922 Triangle in which n-th row gives prime factors of n-th Fermat number 2^(2^n)+1.
 * @author Sean A. Irvine
 */
public class A050922 implements Sequence {

  private Z[] mA = {};
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      mA = Jaguar.factor(Z.ONE.shiftLeft(1 << ++mN).add(1)).toZArray();
      mM = 0;
    }
    return mA[mM];
  }
}
