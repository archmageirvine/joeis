package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080785 Least p-smooth number not less than n, where p is the smallest prime factor of n.
 * @author Sean A. Irvine
 */
public class A080785 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long lpf = Functions.LPF.l(++mN);
    long m = mN;
    while (true) {
      if (Functions.GPF.l(m) <= lpf) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}
