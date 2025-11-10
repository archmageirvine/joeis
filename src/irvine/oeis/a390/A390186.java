package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390186 Numbers k such that |s(k) - k| &lt; |s(s(k)) - s(k)|, where s(k) is the sum of the proper divisors of k.
 * @author Sean A. Irvine
 */
public class A390186 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z s = Functions.ALIQUOT.z(++mN);
      if (s.subtract(mN).abs().compareTo(Functions.ALIQUOT.z(s).subtract(s).abs()) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
