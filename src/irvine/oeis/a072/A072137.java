package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072099.
 * @author Sean A. Irvine
 */
public class A072137 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z t = mN;
    final HashSet<Z> seen = new HashSet<>();
    long cnt = 0;
    seen.add(t);
    while (seen.add(t = t.subtract(Functions.REVERSE.z(t)).abs())) {
      ++cnt;
    }
    final Z q = t;
    while (!(t = t.subtract(Functions.REVERSE.z(t)).abs()).equals(q)) {
      --cnt;
    }
    return Z.valueOf(cnt);
  }
}
