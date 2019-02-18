package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A018857.
 * @author Sean A. Irvine
 */
public class A018857 implements Sequence {

  private DynamicArray<String> mCache = new DynamicArray<>();
  {
    mCache.set(0, "1");
  }
  private Z mT = Z.ONE;
  private int mN = 0;

  protected int base() {
    return 3;
  }

  protected String pow(final int n) {
    // We only need to keep the first 10 digits (keeps memory down)
    while (n >= mCache.length()) {
      mT = mT.multiply(base());
      final String s = mT.toString();
      mCache.set(mCache.length(), s.length() <= 10 ? s : s.substring(0, 10));
    }
    return mCache.get(n);
  }

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    int b = -1;
    while (true) {
      if (pow(++b).startsWith(target)) {
        return Z.valueOf(base()).pow(b);
      }
    }
  }
}
