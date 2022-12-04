package irvine.oeis.a060;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicArray;

/**
 * A060611 Smallest prime p such that n = A049108(p) = length of chain of iterates of Euler Phi starting with p.
 * @author Sean A. Irvine
 */
public class A060611 extends A000040 {

  private final DynamicArray<Z> mA = new DynamicArray<>();
  private int mN = 0;
  {
    setOffset(2);
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      final Z p = super.next();
      Z q = p;
      int cnt = 0;
      while (!Z.ONE.equals(q)) {
        ++cnt;
        q = Euler.phi(q);
      }
      if (mA.get(cnt) == null) {
        mA.set(cnt, p);
      }
    }
    return mA.get(mN);
  }
}
