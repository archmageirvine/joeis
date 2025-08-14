package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079432 a(n) = A079431(A079431(n)).
 * @author Sean A. Irvine
 */
public class A079432 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long lpf = Functions.LPF.l(Functions.MAKE_ODD.l(++mN));
    long m = mN;
    int cnt = 0;
    while (true) {
      if (Functions.LPF.l(Functions.MAKE_ODD.l(++m)) == lpf && ++cnt == 2) {
        return Z.valueOf(m);
      }
    }
  }
}

