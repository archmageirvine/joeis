package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicArray;

/**
 * A003250.
 * @author Sean A. Irvine
 */
public class A003250 extends A003234 {

  private final A003231 mS = new A003231();
  private final LongDynamicArray<Z> mA3231 = new LongDynamicArray<>();
  {
    mA3231.set(0, null);
  }

  private Z a3231(final long n) {
    while (n >= mA3231.length()) {
      mA3231.set(mA3231.length(), mS.next());
    }
    return mA3231.get(n);
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return n.multiply(5).subtract(1).subtract(a3231(n.longValueExact()));
  }

}
