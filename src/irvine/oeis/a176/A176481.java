package irvine.oeis.a176;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a001.A001333;

/**
 * A176481 Triangle, read by rows, defined by T(n, k) = b(n) - b(k) - b(n-k) + 2, where b(n) = A001333(n).
 * @author Sean A. Irvine
 */
public class A176481 extends A001333 {

  private int mN = -1;
  private int mM = 0;
  private final ArrayList<Z> mA = new ArrayList<>();

  private Z get(final int n) {
    while (n >= mA.size()) {
      mA.add(super.next());
    }
    return mA.get(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN).subtract(get(mM)).subtract(get(mN - mM)).add(2);
  }
}
