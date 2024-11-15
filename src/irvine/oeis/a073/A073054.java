package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073054 Number of applications of DENEAT operator x -&gt; A073053(x) needed to transform n to 123.
 * @author Sean A. Irvine
 */
public class A073054 extends Sequence0 {

  private static final Z Z123 = Z.valueOf(123);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long cnt = 0;
    while (!m.equals(Z123)) {
      m = A073053.deneat(m);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
