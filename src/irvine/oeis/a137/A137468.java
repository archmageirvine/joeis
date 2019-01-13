package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A137468.
 * @author Sean A. Irvine
 */
public class A137468 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mVerbose && mN % 1000000 == 1) {
        System.err.println("[" + mN + "]");
      }
      final Z n = Z.valueOf(mN).pow(5);
      final String s = n.toString();
      boolean ok = true;
      for (int k = 0; k < s.length(); ++k) {
        if ((s.charAt(k) & 1) == 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return n;
      }
    }
  }
}

