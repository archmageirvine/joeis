package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a392.A392781;

/**
 * A391716 allocated for Miles Englezou.
 * @author Sean A. Irvine
 */
public class A391716 extends Sequence1 {

  private final A392781 mF = new A392781();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    while (!t.isZero()) {
      t = mF.a(t);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
