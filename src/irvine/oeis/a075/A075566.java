package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075566 Rearrangement of natural numbers by choosing alternately even and odd numbers such that every partial sum a(1)+...+a(n) is composite.
 * @author Sean A. Irvine
 */
public class A075566 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSum = Z.ZERO;
  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    long m = mEven ? 0 : -1;
    while (true) {
      m += 2;
      if (!mUsed.isSet(m)) {
        final Z s = mSum.add(m);
        if (!s.isProbablePrime()) {
          mSum = s;
          mUsed.set(m);
          return Z.valueOf(m);
        }
      }
    }
  }
}

