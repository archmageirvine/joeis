package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026280 a(n) = a(m) if a(m) has already occurred exactly once and n = a(m) + m + 3, else a(n) = least positive integer that has not yet occurred.
 * @author Sean A. Irvine
 */
public class A026280 extends Sequence1 {

  private final TreeMap<Long, Long> mFixed = new TreeMap<>();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    if (mFixed.containsKey(mN)) {
      return Z.valueOf(mFixed.remove(mN));
    } else {
      ++mM;
      mFixed.put(mM + mN + 3, mM);
      return Z.valueOf(mM);
    }
  }
}
