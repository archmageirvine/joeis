package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051918 Start with n, apply k-&gt;2k+1 until reach new record prime; sequence gives number of steps needed.
 * @author Sean A. Irvine
 */
public class A051918 extends Sequence0 {

  private Z mP = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    do {
      ++cnt;
      m = m.multiply2().add(1);
    } while (m.compareTo(mP) <= 0 || !m.isProbablePrime());
    mP = m;
    return Z.valueOf(cnt);
  }
}
