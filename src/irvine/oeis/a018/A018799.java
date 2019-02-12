package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A018799.
 * @author Sean A. Irvine
 */
public class A018799 implements Sequence {

  private DynamicArray<String> mCache = new DynamicArray<>();
  {
    mCache.set(0, "1");
  }
  private Z mF = Z.ONE;
  private int mM = 0;
  private int mN = 0;

  private String factorial(final int n) {
    // We only need to keep the first 10 digits (keeps memory down)
    while (n >= mCache.length()) {
      mF = mF.multiply(++mM);
      final String s = mF.toString();
      mCache.set(mM, s.length() <= 10 ? s : s.substring(0, 10));
    }
    return mCache.get(n);
  }

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    int b = -1;
    while (true) {
      if (factorial(++b).startsWith(target)) {
        return Z.valueOf(b);
      }
    }
  }
}
