package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A045876 Sum of different permutations of digits of n (leading 0's allowed).
 * @author Sean A. Irvine
 */
public class A045876 extends Sequence1 {

  // After Robert Israel

  private long mN = 0;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    long s = 0;
    int t = 0;
    for (int k = 0; k <= 9; ++k) {
      t += cnts[k];
      s += (long) k * cnts[k];
    }
    return Binomial.multinomial(t, cnts).multiply(Z.TEN.pow(t).subtract(1)).multiply(s).divide(9L * t);
  }
}
