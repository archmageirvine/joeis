package irvine.oeis.a160;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A160504 a(n) = number of ordered pairs (i,j) such that a(i)+a(j)&lt;n, i&lt;j&lt;n; a(1)=a(2)=1.
 * @author Sean A. Irvine
 */
public class A160504 implements Sequence {

  private final DynamicIntArray mA = new DynamicIntArray();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      mA.set(mN, 1);
      return Z.ONE;
    }
    int c = 0;
    for (int i = 1; i < mN; ++i) {
      for (int j = i + 1; j < mN; ++j) {
        if (mA.get(i) + mA.get(j) < mN) {
          ++c;
        }
      }
    }
    mA.set(mN, c);
    return Z.valueOf(c);
  }
}

