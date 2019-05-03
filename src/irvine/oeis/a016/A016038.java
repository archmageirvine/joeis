package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016038 Strictly non-palindromic numbers: n is not palindromic in any base b with <code>2 &lt;= b &lt;= n-2</code>.
 * @author Sean A. Irvine
 */
public class A016038 implements Sequence {

  private final int[] mWork = new int[64]; // plenty of space for now
  private long mN = -1;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      // write n in successive bases until palindrome detected
      for (int base = 2; base <= mN - 2; ++base) {
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
          continue outer; // palindrome detected
        }
      }
      return Z.valueOf(mN);
    }
  }
}
