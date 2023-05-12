package irvine.oeis.a063;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A063507.
 * @author Sean A. Irvine
 */
public class A063748 extends A051953 {

  private final HashMap<Long, Long> mSeen = new HashMap<>();
  private long mM = 1;

  @Override
  public Z next() {
    ++mM;
    for (int k = 0; k < 2 * mM; ++k) {
      mSeen.put(super.next().longValueExact(), mN);
    }
    final Long res = mSeen.remove(mM);
    return res == null ? Z.ZERO : Z.valueOf(res);
  }
}
