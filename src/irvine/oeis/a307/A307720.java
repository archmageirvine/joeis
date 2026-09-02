package irvine.oeis.a307;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A307720
 * @author Sean A. Irvine
 */
public class A307720 extends Sequence1 {

  private final Map<Long, Long> mC = new HashMap<>();
  private long mB = 1;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    long k = 1;
    long kb = mB;
    while (mC.getOrDefault(kb, 0L) >= kb) {
      ++k;
      kb += mB;
    }
    mC.put(kb, mC.getOrDefault(kb, 0L) + 1);
    mB = k;
    return Z.valueOf(k);
  }
}
