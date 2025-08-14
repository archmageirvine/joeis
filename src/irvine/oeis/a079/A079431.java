package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079431 Least m&gt;n with same smallest odd prime factor as n.
 * @author Sean A. Irvine
 */
public class A079431 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long lpf = Functions.LPF.l(Functions.MAKE_ODD.l(++mN));
    long m = mN;
    while (true) {
      if (Functions.LPF.l(Functions.MAKE_ODD.l(++m)) == lpf) {
        return Z.valueOf(m);
      }
    }
  }
}

