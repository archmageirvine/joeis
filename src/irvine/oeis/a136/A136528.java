package irvine.oeis.a136;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A136528 <code>a(n) =</code> the highest possible number of positive divisors of the sum of <code>any</code> two distinct positive divisors of n.
 * @author Sean A. Irvine
 */
public class A136528 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final Z[] div = Cheetah.factor(++mN).divisors();
    long c = 0;
    for (int k = 0; k < div.length - 1; ++k) {
      for (int j = k + 1; j < div.length; ++j) {
        final long t = Cheetah.factor(div[k].add(div[j])).sigma0();
        if (t > c) {
          c = t;
        }
      }
    }
    return Z.valueOf(c);
  }
}
