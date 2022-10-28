package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060140 Ordered set S defined by these rules: 0 and 1 are in S and if x is a nonzero number in S, then 3x and 9x+1 are in S.
 * @author Sean A. Irvine
 */
public class A060140 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    if (!res.isZero()) {
      mA.add(res.multiply(3));
      mA.add(res.multiply(9).add(1));
    }
    return res;
  }
}
