package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;
import irvine.util.array.DynamicArray;

/**
 * A018855 Smallest triangular number that begins with n.
 * @author Sean A. Irvine
 */
public class A018855 extends A000217 {

  /** Construct the sequence. */
  public A018855() {
    super(1);
  }

  private DynamicArray<String> mCache = new DynamicArray<>();
  private int mN = 0;

  private String triangular(final int n) {
    while (n >= mCache.length()) {
      mCache.set(mCache.length(), super.next().toString());
    }
    return mCache.get(n);
  }

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    int b = -1;
    while (true) {
      if (triangular(++b).startsWith(target)) {
        return new Z(triangular(b));
      }
    }
  }
}
