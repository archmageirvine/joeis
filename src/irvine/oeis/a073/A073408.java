package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073408 Let cophi_m(x) denotes the cototient function applied m times to x (cophi(x)=x-phi(x)). Sequence gives the minimum number of iterations m such that cophi_m(n) divides n.
 * @author Sean A. Irvine
 */
public class A073408 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    do {
      m = Functions.COTOTIENT.l(m);
      ++cnt;
    } while (mN % m != 0);
    return Z.valueOf(cnt);
  }
}

