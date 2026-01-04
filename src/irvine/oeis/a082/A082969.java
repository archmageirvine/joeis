package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082969 Numbers n such that (n/4)^2-n/8=sum(k=1,n, k mod sum(i=0,k-1,1-t(i))) where t(i)=A010060(i) is the Thue-Morse sequence.
 * @author Sean A. Irvine
 */
public class A082969 extends Sequence1 {

  private long mN = 0;
  private long mMod = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mMod += 1 - Functions.THUE_MORSE.l(mN - 1);
      mSum = mSum.add(mN % mMod);
      if (mSum.shiftLeft(4).equals(Z.valueOf(mN).square().subtract(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
