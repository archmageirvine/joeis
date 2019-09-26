package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026350 <code>a(n) = a(m)</code> if <code>a(m)</code> has already occurred exactly once and <code>n = a(m)+m-1</code>, else <code>a(n) =</code> least positive integer that has not yet occurred.
 * @author Sean A. Irvine
 */
public class A026350 implements Sequence {

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
      mFixed.put(mM + mN - 1, mM);
      return Z.valueOf(mM);
    }
  }
}
