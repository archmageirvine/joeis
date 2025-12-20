package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082714 Numbers n such that 2*(10^n-1)/3+(10^(n-1)+1) or (69*10^(n-1)+3)/9 is a plateau or depression prime.
 * @author Sean A. Irvine
 */
public class A082714 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mT;
      mT = mT.multiply(10);
      if (mT.subtract(1).divide(3).multiply2().add(t).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
      if (t.multiply(69).add(3).divide(9).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
