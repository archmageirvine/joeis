package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067944 Integers of the form (rep(n)-1)/n where rep(n)=1111111111...111 with n 1's is the n-th repunit number.
 * @author Sean A. Irvine
 */
public class A067944 extends Sequence1 {

  private long mN = 1;
  private Z mRep = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mRep.multiply(10);
      mRep = t.add(1);
      if (t.mod(++mN) == 0) {
        return t.divide(mN);
      }
    }
  }
}
