package irvine.oeis.a046;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A046300 Smallest integer k such that 2^n is the largest power of two that is contained in 2^k as a proper substring.
 * @author Sean A. Irvine
 */
public class A046300 implements Sequence {

  private final ArrayList<String> mS = new ArrayList<>();
  private Z mA = Z.ONE;
  private int mN = -1;
  private int mM = -1;
  private final DynamicIntArray mFirst = new DynamicIntArray();

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      if (++mM > 0) {
        mA = mA.multiply2();
      }
      final String s = mA.toString();
      int k = mS.size();
      while (--k >= 0 && !s.contains(mS.get(k))) {
        // do nothing
      }
      if (k >= 0 && mFirst.get(k) == 0) {
        mFirst.set(k, mM + 1); // +1 because we are using 0 as not yet found
      }
      mS.add(s);
    }
    return Z.valueOf(mFirst.get(mN) - 1); // -1 because we are using 0 as not yet found
  }
}
