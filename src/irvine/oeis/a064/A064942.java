package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064933.
 * @author Sean A. Irvine
 */
public class A064942 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().toString().length() / 2 == mN) {
      ++mN;
      final Z t = Z.TEN.pow(2 * mN).add(1);
      final Z tm = Z.TEN.pow(mN);
      Z i2;
      for (Z i = Z.TWO; (i2 = i.square()).multiply2().compareTo(t) < 0; i = i.add(1)) {
        final Z u = t.subtract(i2);
        final Z[] j = u.sqrtAndRemainder();
        if (j[1].isZero()) {
          final Z a;
          final Z b;
          if (i.isOdd()) {
            a = j[0].add(tm).divide2();
            b = i.add(1).divide2();
          } else {
            a = i.add(tm).divide2();
            b = j[0].add(1).divide2();
          }
          mA.add(tm.subtract(a).multiply(tm).add(b));
          mA.add(a.multiply(tm).add(b));
        }
      }
    }
    return mA.pollFirst();
  }
}
