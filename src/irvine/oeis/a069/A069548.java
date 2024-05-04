package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069548 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 1;

  private Z f(final int n) {
    return Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d * 6 / (2 + Functions.MOBIUS.i(d))));
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().intValue() >= 3 * mN * mN) {
      final Z t = f(mN * mN);
      if (t.isProbablePrime()) {
        mA.add(t);
      }
      final Z u = f(2 * mN * mN);
      if (u.isProbablePrime()) {
        mA.add(u);
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
