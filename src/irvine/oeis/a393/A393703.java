package irvine.oeis.a393;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a206.A206400;
import irvine.util.string.StringUtils;

/**
 * A393703 allocated for Michel Lagneau.
 * @author Sean A. Irvine
 */
public class A393703 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  @Override
  public Z next() {
    final Z[] b = new Z[++mN];
    final Sequence s = new A206400();
    for (int i = 0; i < mN; ++i) {
      b[i] = s.next();
    }
    long k = 1;
    while (!ZUtils.isPalindrome(b)) {
      System.arraycopy(b, 1, b, 0, b.length - 1);
      b[mN - 1] = s.next();
      ++k;
      if (mVerbose && k % 100000 == 0) {
        StringUtils.message("n=" + mN + " search completed to " + k);
      }
    }
    if (mVerbose) {
      StringUtils.message("n=" + mN + " solution: " + Arrays.toString(b));
    }
    return Z.valueOf(k);
  }
}
