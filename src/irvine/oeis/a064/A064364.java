package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000792;
import irvine.util.array.DynamicArray;

/**
 * A064364 Positive integers sorted by A001414(n), the sum of their prime divisors, as the major key and n as the minor key.
 * @author Sean A. Irvine
 */
public class A064364 extends Sequence1 {

  private final Sequence mUpper = new A000792().skip();
  private Z mU = mUpper.next();
  private final DynamicArray<TreeSet<Z>> mA = new DynamicArray<>();
  private int mN = 1;
  {
    mA.set(1, new TreeSet<>());
    mA.get(1).add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.get(mN).pollFirst();
    if (res.equals(mU)) {
      // We just hit the end of the row
      ++mN;
      Z t = mU;
      mU = mUpper.next();
      for (Z u = t.add(1); u.compareTo(mU) <= 0; u = u.add(1)) {
        final int s = Jaguar.factor(u).sopfr().intValueExact();
        final TreeSet<Z> v = mA.get(s);
        if (v != null) {
          v.add(u);
        } else {
          final TreeSet<Z> w = new TreeSet<>();
          w.add(u);
          mA.set(s, w);
        }
      }
    }
    return res;
  }
}
