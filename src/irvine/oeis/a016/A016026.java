package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016026 Smallest base relative to which n is palindromic.
 * @author Sean A. Irvine
 */
public class A016026 implements Sequence {

  private final int[] mWork = new int[64]; // plenty of space for now
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    // write n in successive bases until palindrome detected
    int base = 1;
    while (true) {
      ++base;
      int k = 0;
      long m = mN;
      while (m != 0) {
        mWork[k++] = (int) (m % base);
        m /= base;
      }
      boolean ok = true;
      for (int i = 0, j = k - 1; i < j; ++i, --j) {
        if (mWork[i] != mWork[j]) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(base);
      }
    }
  }
}
