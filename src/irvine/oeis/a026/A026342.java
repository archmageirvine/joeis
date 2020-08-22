package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026342 a(n) = a(m) if a(m) has already occurred exactly once and n = m+[ (m+1)/2 ], else a(n) = least positive integer that has not yet occurred.
 * @author Sean A. Irvine
 */
public class A026342 implements Sequence {

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
      mFixed.put(mN + (mN + 1) / 2, mM);
      return Z.valueOf(mM);
    }
  }
}
