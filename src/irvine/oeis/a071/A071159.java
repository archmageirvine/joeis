package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071153.
 * @author Sean A. Irvine
 */
public class A071159 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long r = res.mod(10);
    final Z t = res.multiply(10);
    for (long k = 1; k <= r + 1; ++k) {
      mA.add(t.add(k));
    }
    return res;
  }
}
