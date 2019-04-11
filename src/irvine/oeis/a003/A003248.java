package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;
import irvine.util.array.LongDynamicArray;

/**
 * A003248 A000201(A003234(n)) <code>+ n</code>.
 * @author Sean A. Irvine
 */
public class A003248 extends A003234 {

  private final A000201 mS = new A000201();
  private final LongDynamicArray<Z> mA201 = new LongDynamicArray<>();
  {
    mA201.set(0, null);
  }
  private long mN = 0;

  private Z a201(final long n) {
    while (n >= mA201.length()) {
      mA201.set(mA201.length(), mS.next());
    }
    return mA201.get(n);
  }

  @Override
  public Z next() {
    return a201(super.next().longValueExact()).add(++mN);
  }

}
