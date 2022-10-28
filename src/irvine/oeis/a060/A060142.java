package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060142 Ordered set S defined by these rules: 0 is in S and if x is in S then 2x+1 and 4x are in S.
 * @author Sean A. Irvine
 */
public class A060142 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    if (!res.isZero()) {
      mA.add(res.multiply2().add(1));
      mA.add(res.multiply(4));
    }
    return res;
  }
}
