package irvine.oeis.a026;

import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A026411 Position of the second n in A026409.
 * @author Sean A. Irvine
 */
public class A026411 extends A026409 {

  /** Construct the sequence. */
  public A026411() {
    super(2);
  }

  private final TreeSet<Long> mSeenFirst = new TreeSet<>();
  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (!mMap.containsKey(mN)) {
      final long s = super.next().longValueExact();
      ++mM;
      if (s >= mN && !mMap.containsKey(s) && !mSeenFirst.add(s)) {
        mMap.put(s, mM);
      }
    }
    mSeenFirst.remove(mN);
    return Z.valueOf(mMap.remove(mN));
  }
}
