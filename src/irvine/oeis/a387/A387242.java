package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a334.A334676;
import irvine.util.array.LongDynamicArray;

/**
 * A387242 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A387242 extends Sequence1 {

  private long mN = 0;
  private final Sequence mS = new A334676();
  private final LongDynamicArray<String> mA = new LongDynamicArray<>();
  {
    mA.set(0, "");
  }

  private String get(final long v) {
    while (v >= mA.length()) {
      final Z t = mS.next();
      mA.set(mA.length(), t.equals(v) ? "" : t.toString());
    }
    return mA.get(v);
  }

  @Override
  public Z next() {
    final String sn = String.valueOf(++mN);
    long k = 0;
    while (true) {
      if (get(++k).contains(sn)) {
        return Z.valueOf(k);
      }
    }
  }
}

