package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079759 Let b(0)=0. For n &gt;= 1, b(n) is the least k &gt; b(n-1)+1 such that k divides (k-1)!/b(n-1)!, and a(n) = (b(n)-1)!/(b(n-1)!*b(n)).
 * @author Sean A. Irvine
 */
public class A079759 extends Sequence1 {

  // After Robert Israel

  private Z mT = null;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ZERO;
      return Z.ONE;
    }
    Z p = mT.add(1);
    Z j = mT.add(2);
    while (!p.mod(j).isZero()) {
      p = p.multiply(j);
      j = j.add(1);
    }
    mT = j;
    return p.divide(j);
  }
}

