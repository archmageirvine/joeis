package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050944 Numbers k such that sigma(k) &gt; sigma(k+1) &gt; sigma(k+2) &gt; sigma(k+3).
 * @author Sean A. Irvine
 */
public class A050944 implements Sequence {

  private long mN = 43;

  @Override
  public Z next() {
    while (true) {
      final Z s0 = Jaguar.factor(++mN).sigma();
      final Z s1 = Jaguar.factor(mN + 1).sigma();
      if (s0.compareTo(s1) > 0) {
        final Z s2 = Jaguar.factor(mN + 2).sigma();
        if (s1.compareTo(s2) > 0 && s2.compareTo(Jaguar.factor(mN + 3).sigma()) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
