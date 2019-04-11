package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a001.A001950;
import irvine.util.array.LongDynamicArray;

/**
 * A003249 A001950(A003234(n)) <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A003249 extends A003234 {

  private final A001950 mS = new A001950();
  private final LongDynamicArray<Z> mA1950 = new LongDynamicArray<>();
  {
    mA1950.set(0, null);
  }

  private Z a1950(final long n) {
    while (n >= mA1950.length()) {
      mA1950.set(mA1950.length(), mS.next());
    }
    return mA1950.get(n);
  }

  @Override
  public Z next() {
    return a1950(super.next().longValueExact()).add(1);
  }

}
