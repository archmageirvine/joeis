package irvine.oeis.a063;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A063507 Least k such that k - phi(k) = n, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A063507 extends A051953 {

  private final HashMap<Long, Long> mSeen = new HashMap<>();
  private long mM = 0;

  @Override
  public Z next() {
    ++mM;
    for (int k = 0; k < 2 * mM; ++k) {
      mSeen.putIfAbsent(super.next().longValueExact(), mN);
    }
    final Long res = mSeen.remove(mM);
    return res == null ? Z.ZERO : Z.valueOf(res);
  }
}
