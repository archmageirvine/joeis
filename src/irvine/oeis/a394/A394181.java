package irvine.oeis.a394;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A394181 Simultaneously grow three sequences S, T and A starting with S(1)=T(1)=a(1)=2. Search for the smallest integer m in S so that one of its multiples k*m is larger than T(n) and closer to T(n) than (k-1)*m. If this is true, a(n+1) = m and T(n+1) = k*m. Otherwise, add the smallest positive integer, m, to S that holds this property.
 * @author Sean A. Irvine
 */
public class A394181 extends Sequence1 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private final TreeSet<Z> mS = new TreeSet<>();
  private final DynamicArray<Z> mT = new DynamicArray<>();

  @Override
  public Z next() {
    if (mA.length() == 0) {
      mA.set(0, Z.TWO);
      mS.add(Z.TWO);
      mT.set(0, Z.TWO);
      return Z.TWO;
    }
    final int n = mA.length() - 1;
    final Z tn = mT.get(n);
    for (final Z m : mS) {
      final Z k1 = tn.divide(m);
      final Z d1 = tn.subtract(k1.multiply(m));
      if (d1.signum() > 0) {
        final Z k = k1.add(1);
        final Z km = k.multiply(m);
        if (km.compareTo(tn) > 0 && km.subtract(tn).compareTo(d1) < 0) {
          mA.set(n + 1, m);
          mT.set(n + 1, km);
          mS.add(m);
          return m;
        }
      }
    }
    // We didn't find a solution in S, so update S
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (!mS.contains(m)) {
        final Z k1 = tn.divide(m);
        final Z d1 = tn.subtract(k1.multiply(m));
        if (d1.signum() > 0) {
          final Z k = k1.add(1);
          final Z km = k.multiply(m);
          if (km.compareTo(tn) > 0 && km.subtract(tn).compareTo(d1) < 0) {
            mA.set(n + 1, m);
            mT.set(n + 1, km);
            mS.add(m);
            return m;
          }
        }
      }
    }
  }
}

