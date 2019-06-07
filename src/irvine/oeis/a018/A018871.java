package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A018871 Smallest fifth power that begins with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A018871 implements Sequence {

  private DynamicArray<String> mCache = new DynamicArray<>();
  private int mN = -1;

  protected int exp() {
    return 5;
  }

  protected String pow(final int n) {
    // We only need to keep the first 10 digits (keeps memory down)
    while (n >= mCache.length()) {
      final Z t = Z.valueOf(mCache.length()).pow(exp());
      final String s = t.toString();
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
        return Z.valueOf(b).pow(exp());
      }
    }
  }
}
