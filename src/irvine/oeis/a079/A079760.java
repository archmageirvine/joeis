package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079760 Denominator in the expression for a(n) in A079759.
 * @author Sean A. Irvine
 */
public class A079760 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    Z p = mT.add(1);
    Z j = mT.add(2);
    while (!p.mod(j).isZero()) {
      p = p.multiply(j);
      j = j.add(1);
    }
    mT = j;
    return j;
  }
}

