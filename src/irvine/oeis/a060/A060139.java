package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060139 Ordered set S defined by these rules: 0 and 1 are in S and if x is a nonzero number in S, then 3x-1 and 9x are in S.
 * @author Sean A. Irvine
 */
public class A060139 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    if (!res.isZero()) {
      mA.add(res.multiply(3).subtract(1));
      mA.add(res.multiply(9));
    }
    return res;
  }
}
