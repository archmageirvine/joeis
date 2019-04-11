package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006467 Continued fraction for Sum_{n&gt;=0} <code>(-1)^n/3^(2^n)</code>.
 * @author Sean A. Irvine
 */
public class A006467 implements Sequence {

  private int[] mS = {0, 4, 2};
  private int mN = -1;
  private int mV = 0;

  private void update() {
    if (mN >= mS.length - 3) {
      ++mV;
      final int n = mS.length - 1;
      final int[] c = Arrays.copyOf(mS, mS.length * 2 - 1);
      final boolean even = (mV & 1) == 0;
      c[n + 1] = c[n] + (even ? 1 : -1);
      c[n] -= even ? 1 : -1;
      for (int k = 1; k < n; ++k) {
        c[c.length - k] = mS[k];
      }
      mS = c;
    }
  }

  @Override
  public Z next() {
    update();
    return Z.valueOf(mS[++mN]);
  }
}
