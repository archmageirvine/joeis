package irvine.oeis.a003;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A003603 Fractal sequence obtained from Fibonacci numbers (or Wythoff array).
 * @author Sean A. Irvine
 */
public class A003603 implements Sequence {

  // After Clark Kimberling's description

  private HashSet<Z> mPrev = new HashSet<>();
  private LongDynamicArray<Z> mA = new LongDynamicArray<>();
  private int mN = 0;
  private int mM = 0;
  private Z mLeastUnused = Z.FOUR;

  @Override
  public Z next() {
    if (mM >= mA.length()) {
      mM = 0;
      switch (++mN) {
        case 1:
          mA.set(0, Z.ONE);
          break;
        case 2:
          // This one needs no change to the array, it is the same as n = 1
          break;
        case 3:
          mA.set(1, Z.TWO);
          mPrev.add(Z.ONE);
          mPrev.add(Z.TWO);
          break;
        case 4:
          mA.set(1, Z.THREE);
          mA.set(2, Z.TWO);
          break;
        default:
          final LongDynamicArray<Z> next = new LongDynamicArray<>();
          final HashSet<Z> prev = new HashSet<>();
          for (int k = 0, j = 0; k < mA.length(); ++k) {
            final Z value = mA.get(k);
            prev.add(value);
            next.set(j++, value);
            if (mPrev.contains(value)) {
              next.set(j++, mLeastUnused);
              mLeastUnused = mLeastUnused.add(1);
            }
          }
          mA = next;
          mPrev = prev;
          break;
      }
    }
    return mA.get(mM++);
  }
}
