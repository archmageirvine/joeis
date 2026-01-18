package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A083140 Sieve of Eratosthenes arranged as an array and read by antidiagonals in the up direction; n-th row has property that smallest prime factor is prime(n).
 * @author Sean A. Irvine
 */
public class A083140 extends Sequence1 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n) {
    final Z p = Functions.PRIME.z(n + 1);
    Z a = mA.get(n);
    if (a == null) {
      mA.set(n, p);
      return p;
    }
    while (true) {
      a = a.add(p);
      if (Functions.LPF.z(a).equals(p)) {
        mA.set(n, a);
        return a;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM);
  }
}

