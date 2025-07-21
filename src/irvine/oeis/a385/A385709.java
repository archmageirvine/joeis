package irvine.oeis.a385;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicArray;

/**
 * A385709 Least prime p such that the decimal expansion of p^2 contains exactly n distinct primes as substrings.
 * @author Sean A. Irvine
 */
public class A385709 extends A000040 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z p = super.next();
      Z p2 = p.square();
      final HashSet<Z> primes = new HashSet<>();
      while (!p2.isZero()) {
        Z mod = Z.ONE;
        while (mod.compareTo(p2) < 0) {
          mod = mod.multiply(10);
          final Z u = p2.mod(mod);
          if (u.isProbablePrime()) {
            primes.add(u);
          }
        }
        p2 = p2.divide(10);
      }
      final int size = primes.size();
      if (mFirsts.get(size) == null) {
        mFirsts.set(size, p);
      }
    }
    return mFirsts.get(mN);
  }
}
