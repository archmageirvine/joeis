package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050944 Numbers k such that sigma(k) &gt; sigma(k+1) &gt; sigma(k+2) &gt; sigma(k+3).
 * @author Sean A. Irvine
 */
public class A050944 extends Sequence1 {

  private long mN = 43;

  @Override
  public Z next() {
    while (true) {
      final Z s0 = Functions.SIGMA.z(++mN);
      final Z s1 = Functions.SIGMA.z(mN + 1);
      if (s0.compareTo(s1) > 0) {
        final Z s2 = Functions.SIGMA.z(mN + 2);
        if (s1.compareTo(s2) > 0 && s2.compareTo(Functions.SIGMA.z(mN + 3)) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
