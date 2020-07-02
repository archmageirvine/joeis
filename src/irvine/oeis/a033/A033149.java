package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a002.A002852;
import irvine.util.array.DynamicIntArray;

/**
 * A033149.
 * @author Sean A. Irvine
 */
public class A033149 extends A002852 {

  private final DynamicIntArray mA = new DynamicIntArray();
  private int mM = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      ++mM;
      final int v = super.next().intValueExact();
      if (mA.get(v) == 0) {
        mA.set(v, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
