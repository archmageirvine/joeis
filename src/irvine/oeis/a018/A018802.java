package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A018802 Smallest power of 2 that begins with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A018802 implements Sequence {

  private DynamicArray<String> mCache = new DynamicArray<>();
  private int mM = -1;
  private int mN = 0;

  protected String pow2(final int n) {
    // We only need to keep the first 10 digits (keeps memory down)
    while (n >= mCache.length()) {
      final String s = Z.ONE.shiftLeft(++mM).toString();
      mCache.set(mM, s.length() <= 10 ? s : s.substring(0, 10));
    }
    return mCache.get(n);
  }

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    int b = -1;
    while (true) {
      if (pow2(++b).startsWith(target)) {
        return Z.ONE.shiftLeft(b);
      }
    }
  }
}
