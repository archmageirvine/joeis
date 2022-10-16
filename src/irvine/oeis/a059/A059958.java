package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059958 Smallest number m such that m*(m+1) has at least n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A059958 implements Sequence {

  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (Jaguar.factor(mM * (mM + 1)).omega() < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
