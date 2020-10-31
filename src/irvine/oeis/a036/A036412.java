package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036412.
 * @author Sean A. Irvine
 */
public class A036412 implements Sequence {

  private int mN = 0;

  protected CR getCR() {
    return CR.E;
  }

  @Override
  public Z next() {
    final boolean[] seen = new boolean[++mN];
    for (int k = 1; k <= mN; ++k) {
      seen[getCR().multiply(k).frac().multiply(mN).floor().intValue()] = true;
    }
    int count = 0;
    for (final boolean s : seen) {
      if (!s) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
