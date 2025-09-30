package irvine.oeis.a389;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A389187 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Z> s = new TreeSet<>();
    for (int k = 0; k < 10; ++k) {
      s.add(new Z(String.valueOf(k).repeat(mN)));
    }
    final Z add = Z.TEN.pow(mN);
    while (true) {
      final Z v = s.pollFirst();
      if (Functions.OMEGA.i(v) == mN) {
        return v;
      }
      s.add(v.add(add));
    }
  }
}
