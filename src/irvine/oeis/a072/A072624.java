package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072624 Mod[Prime[n^2],n^2].
 * @author Sean A. Irvine
 */
public class A072624 extends A000040 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    while (mM < s - 1) {
      super.next();
      ++mM;
    }
    ++mM;
    return super.next().mod(Z.valueOf(s));
  }
}
