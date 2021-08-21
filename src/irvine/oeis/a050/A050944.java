package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050944 Four consecutive integers with decreasing values of sigma start at these numbers; i.e., sigma(x) &gt; sigma(x+1) &gt; sigma(x+2) &gt; sigma(x+3).
 * @author Sean A. Irvine
 */
public class A050944 implements Sequence {

  private long mN = 43;

  @Override
  public Z next() {
    while (true) {
      final Z s0 = Cheetah.factor(++mN).sigma();
      final Z s1 = Cheetah.factor(mN + 1).sigma();
      if (s0.compareTo(s1) > 0) {
        final Z s2 = Cheetah.factor(mN + 2).sigma();
        if (s1.compareTo(s2) > 0 && s2.compareTo(Cheetah.factor(mN + 3).sigma()) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
