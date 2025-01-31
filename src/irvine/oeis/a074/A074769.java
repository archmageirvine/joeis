package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006577;
import irvine.util.string.StringUtils;

/**
 * A074769 Least k such that the number of steps to reach 1 starting with k and iterating the Collatz process equals k/n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A074769 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DirectSequence mCollatz = new A006577();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      if (mCollatz.a(++k).multiply(mN).intValueExact() == k) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 1000000 == 0) {
        StringUtils.message(mN + " search completed to " + k);
      }
    }
  }
}
