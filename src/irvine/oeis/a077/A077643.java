package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077643 Number of squarefree integers in closed interval [2^n, -1 + 2*2^n], i.e., among 2^n consecutive numbers beginning with 2^n.
 * @author Sean A. Irvine
 */
public class A077643 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final Z start = Z.TWO.pow(mN);
    final Z end = start.multiply2();
    for (Z t = start; t.compareTo(end) < 0; t = t.add(1)) {
      if (Functions.MOBIUS.i(t) != 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
