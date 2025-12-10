package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082483 Numbers n such that 1/(5-s(n)) is an integer where s(k)=sum(i=1,k,1/2^floor(sqrt(i))).
 * @author Sean A. Irvine
 */
public class A082483 extends Sequence1 {

  private Q mS = Q.FIVE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mS = mS.subtract(new Q(1, Z.ONE.shiftLeft(Functions.SQRT.l(++mN))));
      if (mS.num().isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
